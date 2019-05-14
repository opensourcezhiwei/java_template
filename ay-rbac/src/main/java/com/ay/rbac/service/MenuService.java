package com.ay.rbac.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ay.rbac.dao.MenuDao;
import com.ay.rbac.entity.Menu;
import com.ay.rbac.entity.MenuExample;
import com.ay.rbac.entity.MenuExample.Criteria;
import com.ay.rbac.entity.Role;
import com.ay.rbac.mapper.MenuMapper;

@Service
public class MenuService {

	@Autowired
	private MenuDao menuDao;

	@Autowired
	private MenuMapper menuMapper;

	@Autowired
	private RoleService roleService;

	/** 加载菜单根据角色id */
	public List<Menu> selectByRoleIds(Long... ids) {
		if (ids == null || ids.length <= 0) {
			return null;
		}
		return this.menuDao.selectByRoleIds(ids);
	}

	/** 加载菜单根据用户名 */
	public List<Menu> selectByUsername(String username) {
		// 加载角色
		List<Role> roleList = this.roleService.selectByUsername(username);
		if (roleList == null) {
			return null;
		}
		List<Long> roleIdList = new ArrayList<>();
		for (Role role : roleList) {
			roleIdList.add(role.getId());
		}
		// 加载菜单
		return this.selectByRoleIds(roleIdList.toArray(new Long[roleIdList.size()]));
	}

	public List<Menu> selectParentByChildren(List<Menu> funcMenuList) {
		if (funcMenuList == null || funcMenuList.size() <= 0) {
			return null;
		}
		List<Long> childList = new ArrayList<>();
		for (Menu menu : funcMenuList) {
			childList.add(menu.getId());
		}
		return this.selectParentByChildren(childList.toArray(new Long[childList.size()]));
	}

	public List<Menu> selectParentByChildren(Long... childMenuIds) {
		if (childMenuIds == null || childMenuIds.length == 0) {
			return null;
		}
		return this.menuDao.selectParentByChildIds(childMenuIds);
	}

	public List<Menu> selectByCondition(Menu menu) {
		MenuExample example = new MenuExample();
		Criteria createCriteria = example.createCriteria();
		if (menu != null) {

		}
		return this.menuMapper.selectByExample(example);
	}

	@Transactional
	public int deleteMenuIdsByRoleId(Long roleId) {
		return this.menuDao.deleteMenuIdsByRoleId(roleId);
	}

	@Transactional
	public int insertRoleMenus(Long roleId, List<Long> menuIds) {
		// 过滤不是功能的权限
		MenuExample example = new MenuExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andIdIn(menuIds);
		List<Menu> menuList = this.menuMapper.selectByExample(example);
		if (menuList == null || menuList.size() <= 0) {
			return 0;
		}
		for (Menu menu : menuList) {
			if (menu.getLevel().byteValue() != (byte) 2) {
				menuIds.remove(menu.getId());
			}
		}
		return this.menuDao.insertRoleMenus(roleId, menuIds);
	}

	@Transactional
	public int deleteRoleMenuByRoleId(Long roleId) {
		return this.menuDao.deleteRoleMenuByRoleId(roleId);
	}

}

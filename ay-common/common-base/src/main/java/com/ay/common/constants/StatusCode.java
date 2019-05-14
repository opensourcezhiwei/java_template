package com.ay.common.constants;

/**
 * 状态码
 * 
 * @author jackson
 *
 */
public interface StatusCode {

	final int DEFAULT_PAGE_NUM = 1;
	final int DEFAULT_PAGE_SIZE = 10;

	final String IN = "IN"; // 转入
	final String OUT = "OUT"; // 转出
	final String FREEZE_IN = "FREEZE_IN"; // 冻结转入
	final String FREEZE_OUT = "FREEZE_OUT"; // 冻结转出

	/**************************** 状态码 ****************************/
	final String SUCCESS = "100000"; // 成功
	final String PART_OF_SUCCESS = "100001"; // 部分成功 -- > 针对批量而言
	final String ERROR = "100050"; // 失败
	final String MAYBE = "100099"; // 异常

	final String CLIENT_ID_NOT_EXIST = "110000"; // clientId 不存在
	final String MD5_IS_ERROR = "110001"; // md5 is error
	final String SESSION_IS_NULL_OR_EXPIRE = "110002"; // session is null or expire
	final String PARAM_IS_NULL = "110003"; // param exist null
	final String USERNAME_EXIST = "110004"; // 存在该用户
	final String IP_NOT_IN_WHITE_LIST = "110005"; // ip不在白名单
	final String USERNAME_IS_NOT_EXIST = "110006"; // 不存在该用户
	final String MONEY_FORMAT_ERROR = "110007"; // 金额不识别
	final String MODE_FORMAT_ERROR = "110008"; // 转账方式不识别
	final String MONEY_NOT_ENOUGH = "110010"; // 金额不够
	final String USER_IS_BUSY = "110011"; // 接口正忙
	final String ORDER_NUM_EXIST = "110012"; // 订单号存在
	final String GAME_TYPE_NOT_OPEN = "110013"; // 游戏类型没开放
	final String ODDS_NOT_EXIST = "110014"; // 赔率不存在
	final String EXCEPTION_BILL = "110015"; // 异常订单,需要核对
	final String BET_EXCEPTION = "110016"; // 下注异常
	final String MONEY_NOT_IN_LIMIT = "110017"; // 金额不在限额内
	final String PARAM_NOT_NUMBER = "110018"; // 参数不是整型
	final String BET_TIME_NO_VALID = "110019"; // 下注时间不在有效范围内
	final String TERM_IS_NO_VALID = "110020"; // 奖期不是有效的
	final String TRANSFER_BATCH_USERNAME_EXIST = "110021"; // 存在重复用户名
	final String MONEY_EXCEPTION = "110022"; // 钱包中心异常
	final String USER_DISABLE = "110023"; // 用户被锁定
	final String PARAM_FORMAT_ERROR = "110024"; // 参数格式错误
	final String PLANTID_NOT_EXIST = "110025"; // 平台id不存在
	final String LOGIN_PASSWORD_WRONG = "110026"; // 登录密码错误
	final String PAY_PASSWORD_WRONG = "110027"; // 支付密码错误
	final String EXCEPTION_USER = "110028"; // 異常用戶
	final String PLANT_MAINTENANCE = "110029"; // 平台处于维护

	// 支付特有状态码
	final String PAY_CODE_ERROR = "110050"; // 支付代码映射错误

	// 處理結果返回,用120000段
	final String RESULT_IS_NULL = "120001";
	final String MAINTENANCE = "game is maintenance now!";

	/**************************** 状态消息 ****************************/
	final String STATUS = "status";
	final String MESSAGE = "message";
	final String OK = "ok";
	final String NETWORK_IS_ERROR = "网络错误,稍后重试!";

}

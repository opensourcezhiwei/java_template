package com.ay.common.constants;

import java.util.Arrays;
import java.util.List;

/**
 * 通常字典表
 * 
 * @author jackson
 *
 */
public interface Dictionary {

	// 连表符
	String TABLE_JOIN = "_";

	int MAYBE_MAX_PROCESS = 5;

	/**
	 * 统计状态
	 */
	// 彩票狀態
	List<String> lottoLotteryTotal = Arrays.asList(ResultEnum.WIN.getKey(), ResultEnum.LOSS.getKey(), ResultEnum.CANCEL.getKey(), ResultEnum.TIE.getKey());

	public interface STATUS {
		final byte DISABLE = 0;
		final byte ENABLE = 1;
	}

	/**
	 * 终端类型
	 * 
	 * @author spark
	 *
	 */
	public interface TEMINAL {
		// 1:电脑 2:手机
		final byte COMPUTER = 1;
		final byte MOBILE = 2;
	}

	/**
	 * 真玩还是试玩
	 * 
	 * @author spark
	 *
	 */
	public interface PALY {
		// 0:试玩 1:真玩
		final byte DEMO_PLAY = 0;
		final byte TRUE_PLAY = 1;
	}

	/**
	 * 转账状态
	 * 
	 * @author jackson
	 *
	 */
	interface TransferStatus {
		// 0:开始转行 1:转账中2:转账成功3:转账失败4:转账异常
		byte BEGIN = 0;
		byte ALREADY = 1;
		byte SUCCESS = 2;
		byte FAILED = 3;
		byte EXCEPTION = 4;
	}

	/**
	 * 钱包中心转账类型
	 * 
	 * @author jackson
	 *
	 */
	interface MoneyType {
		// 1: 充值记录, 2: 下注记录, 3:派彩记录, 4: 退款记录, 5: 转账记录, 6: 反水记录, 7:取款记录, 8:代理佣金派发,
		// 9:代理佣金提取, 10:解冻/冻结资金, 11.活动奖金, 12:人工补单, 13:礼物, 14:抢单记录, 15:公司提款
		int DEPOSIT = 1;
		int BET = 2;
		int PAYOFF = 3;
		int REFUND = 4;
		int TRANSFER = 5;
		int BET_BONUE = 6;
		int WITHDRAW = 7;
		int AGENT_COMMISSION_PAYOFF = 8;
		int AGENT_COMMISSION_WITHDRAWAL = 9;
		int FREEZE_BALANCE = 10;
		int ACTIVITY_BONUS = 11;
		int MANUAL_OPERATOR = 12;
		int GIFT = 13;
		int GRAB = 14;
		int CLIENT_WITHDRAWL = 15;
	}

	/**
	 * 平台id
	 * 
	 * @author jackson
	 *
	 */
	public enum PlantId {
		AGIN("agin", "ag国际厅"), //
		AGQ("agq", "ag极速厅"), //
		MONEY("money", "钱包"), //
		H8("H8", "H8体育");
		private String key;

		private String value;

		private PlantId(String key, String value) {
			this.key = key;
			this.value = value;
		}

		public String getKey() {
			return key;
		}

		public String getValue() {
			return value;
		}

		public static String getValueByKey(String key) {
			PlantId[] values = PlantId.values();
			for (PlantId plantId : values) {
				if (plantId.getKey().equals(key)) {
					return plantId.getValue();
				}
			}
			return null;
		}

	}

	/**
	 * 彩种
	 * 
	 * @author jackson
	 *
	 */
	public enum GameType {

		live("live", "视讯"), //
		jilv("jilv", "老虎机"), //
		sport("sport", "体育"), //
		card("card", "棋牌"), //
		lottery("lottery", "彩票"), //
		electron("electron", "电子");

		private String key;
		private String value;

		private GameType(String key, String value) {
			this.key = key;
			this.value = value;
		}

		public String getKey() {
			return key;
		}

		public String getValue() {
			return value;
		}
	}

	/**
	 * 结果狀態
	 */
	public enum ResultEnum {
		// (1:WIN | 2:LOSE | 3:CANCELLED| 4:TIE |5:BET )
		WIN("WIN", "已中奖"), LOSS("LOSS", "未中奖"), CANCEL("CANCEL", "取消"), TIE("TIE", "和"), BET("BET", "投注中");

		private String key;
		private String value;

		private ResultEnum(String key, String value) {
			this.key = key;
			this.value = value;
		}

		public String getKey() {
			return key;
		}

		public String getValue() {
			return value;
		}

	}

	public enum PayType {
		UNION_QRCODE("UNION_QRCODE", "银联扫码"), //
		ALIPAY_QRCODE("ALIPAY_QRCODE", "支付宝扫码"), //
		ALIPAY_RED("ALIPAY_RED", "支付宝红包"), //
		QUICK_PAY("QUICK_PAY", "快捷支付"), //
		WECHAT_QRCODE("WECHAT_QRCODE", "微信支付"), //
		MANUAL("MANUAL", "人工"), //
		PAY("PAY", "支付"), //
		PROXY_PAY("PROXY_PAY", "代付");
		private String key;
		private String value;

		private PayType(String key, String value) {
			this.key = key;
			this.value = value;
		}

		public String getKey() {
			return key;
		}

		public String getValue() {
			return value;
		}

	}

	/**
	 * 支付状态枚举
	 * 
	 * @author jackson
	 *
	 */
	public enum PayStatusEnum {
		PAYING((byte) 1, "支付中"), SUCCESS((byte) 2, "支付成功"), FAILED((byte) 3, "支付失败"), //
		MAYBE((byte) 4, "支付异常"), LOCKED((byte) 5, "锁定"), //
		TO_GRAB((byte) 6, "待抢单"), GRABED((byte) 7, "抢单完成"), //
		REFRESH((byte) 8, "重新生成"), REFUND((byte) 9, "退款中");
		private Byte key;
		private String value;

		private PayStatusEnum(Byte key, String value) {
			this.key = key;
			this.value = value;
		}

		public Byte getKey() {
			return key;
		}

		public String getValue() {
			return value;
		}

		public static String getValueByKey(Byte key) {
			if (key == null) {
				return null;
			}
			PayStatusEnum[] values = PayStatusEnum.values();
			for (PayStatusEnum payStatusEnum : values) {
				if (payStatusEnum.key.byteValue() == key.byteValue()) {
					return payStatusEnum.value;
				}
			}
			return null;
		}
	}

	/**
	 * 彩票类型
	 * 
	 * @author jackson
	 *
	 */
	public enum LotteryType {
		HK6("hk6", "六合彩");

		private String key;
		private String value;

		private LotteryType(String key, String value) {
			this.key = key;
			this.value = value;
		}

		public static String getValueByKey(String key) {
			LotteryType[] values = LotteryType.values();
			for (LotteryType lotteryType : values) {
				if (lotteryType.getKey().equals(key)) {
					return lotteryType.getValue();
				}
			}
			return null;
		}

		public String getKey() {
			return key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

	}

	/**
	 * 下注状态枚举
	 * 
	 * @author jackson
	 *
	 */
	public enum BetStatusEnum {
		BET((byte) 1, "下注未付款"), //
		BETTED((byte) 2, "下注完成"), //
		BET_EXCEPTION((byte) 3, "下注付款异常"), //
		BET_FAILED((byte) 4, "下注付款失败"), //
		WIN((byte) 5, "盈利"), //
		LOSS((byte) 6, "亏损");

		private Byte key;
		private String value;

		private BetStatusEnum(Byte key, String value) {
			this.key = key;
			this.value = value;
		}

		public Byte getKey() {
			return key;
		}

		public String getValue() {
			return value;
		}

	}

}

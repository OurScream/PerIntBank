//转账相关
package zzcontrol;
public class ZZTable {
	private String sfzh;									//获取身份证号
	private String skzh;		 							//skzh:收款账户
	private String skrxm;		 							//收款人姓名
	private double zzje;							 		//转账金额
//	private double zzkyje; 									//
	private String zfzh;									//支付账户
	private double zhye; 									//支付账户的账户余额
	
	public String getsfzh() {return sfzh;}
	public void   setsfzh(String sfzh) {this.sfzh = sfzh;}
	public String getskzh() {return skzh;}
	public void   setskzh(String skzh) {this.skzh = skzh;}
	public String getskrxm() {return skrxm;}
	public void   setskrxm(String skrxm) {this.skrxm = skrxm;}	
	public String getzfzh() {return zfzh;}
	public void   setzfzh(String zfzh) {this.zfzh = zfzh;}
	public double getzzje() {return zzje;}
	public void   setzzje(double zzje) {this.zzje = zzje;}
	public double getzhye() {return zhye;}
	public void   setzhye(double zhye) {this.zhye = zhye;}	
	
}
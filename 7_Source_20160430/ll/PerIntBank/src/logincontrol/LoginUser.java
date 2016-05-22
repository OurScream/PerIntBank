package logincontrol;

public class LoginUser{
	private String zjid; 				//=userid; 数据库中zjid=证件id
	private String khdlmm; 				//=userpwd; 数据库中khdlmm=客户登录密码
	
	public String getzjid() {return zjid;}
	public void   setzjid(String zjid) {this.zjid = zjid;}
	public String getkhdlmm() {return khdlmm;}
	public void   setkhdlmm(String khdlmm) {this.khdlmm = khdlmm;}
}
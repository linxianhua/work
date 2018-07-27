package ssm.lxh.vo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class Fly {
	
	Integer fid;//  航线ID  
	@NotNull(message="航线名称不能为空")
	String fname;// 航线名称
	@NotNull(message="出发城市不允许为空")
	@Pattern(regexp="[襄阳]+",message="出发城市必须为襄阳")
	String gcity;// 起飞城市 
	String tcity;// 到达城市  
	String fdate;// 出发日期  
	String ftime;// 出发时间 
	
	
	public Fly() {
		// TODO Auto-generated constructor stub
	}


	public Integer getFid() {
		return fid;
	}


	public void setFid(Integer fid) {
		this.fid = fid;
	}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getGcity() {
		return gcity;
	}


	public void setGcity(String gcity) {
		this.gcity = gcity;
	}


	public String getTcity() {
		return tcity;
	}


	public void setTcity(String tcity) {
		this.tcity = tcity;
	}


	public String getFdate() {
		return fdate;
	}


	public void setFdate(String fdate) {
		this.fdate = fdate;
	}


	public String getFtime() {
		return ftime;
	}


	public void setFtime(String ftime) {
		this.ftime = ftime;
	}


	@Override
	public String toString() {
		return "Fly [fid=" + fid + ", fname=" + fname + ", gcity=" + gcity + ", tcity=" + tcity + ", fdate=" + fdate
				+ ", ftime=" + ftime + "]";
	}


	public Fly(Integer fid, String fname, String gcity, String tcity, String fdate, String ftime) {
		super();
		this.fid = fid;
		this.fname = fname;
		this.gcity = gcity;
		this.tcity = tcity;
		this.fdate = fdate;
		this.ftime = ftime;
	}
	
	
	

}

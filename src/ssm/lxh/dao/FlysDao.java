package ssm.lxh.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import ssm.lxh.vo.Fly;

public interface FlysDao {

	public List<Fly> getFly();

	public void addFly(Fly fly);
	
	public void shangchuFly(int fid);
	
	public Fly chagai(int fid);
	
	public void update(Fly fly);
}

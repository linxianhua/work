package ssm.lxh.mapper;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;

import ssm.lxh.vo.Fly;

@RequestMapping
public interface FlyMapperinfoDao  {
	
	public List<Fly> selectFly();
	
	
	public void insertFly(Fly fly);
	
	public void deleteFly(int fid);


	public Fly chaid(int fid);
	
	
	public void updateFly(Fly fly);

	
}

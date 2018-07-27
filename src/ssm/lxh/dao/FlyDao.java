package ssm.lxh.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ssm.lxh.mapper.FlyMapperinfoDao;
import ssm.lxh.vo.Fly;

@Repository("fly")
public class FlyDao implements FlysDao {

	@Autowired
	FlyMapperinfoDao fmapper;

	@Override
	public List<Fly> getFly() {

		List<Fly> selectFly = fmapper.selectFly();
		return selectFly;
	}

	@Override
	public void addFly(Fly fly) {
		
		fmapper.insertFly(fly);
			
	}

	@Override
	public void shangchuFly(int fid) {
		
		fmapper.deleteFly(fid);
		
	}

	@Override
	public Fly chagai(int fid) {
		
	return	fmapper.chaid(fid);
		
	}

	@Override
	public void update(Fly fly) {
		
		fmapper.updateFly(fly);
		
	}


}

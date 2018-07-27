package ssm.lxh.mycontroller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ssm.lxh.dao.FlyDao;
import ssm.lxh.dao.FlysDao;
import ssm.lxh.vo.Fly;

@Controller
public class MyController {
	
	@Autowired 
	FlysDao flyDao;
	
	//刷新
	@RequestMapping("/hangxian")
	private ModelAndView chaFly(){
		
		ModelAndView mView = new ModelAndView();
		List<Fly> fly = flyDao.getFly();
		
		mView.addObject("fly",fly);
		mView.setViewName("file");
		
		return mView;
	}
	
	//添加
	@RequestMapping("/tianjia")
	public String jiaFly(Fly fly){
		
	flyDao.addFly(fly);
	return "redirect:file.fc";
		
		
	}
	
	//删除
	@RequestMapping("/shanchu")
	public String deleteFly(int fid){
		
		flyDao.shangchuFly(fid);
		System.out.println(fid);
		return "redirect:file.fc";
		
	}
	
	
	//修改查询
	@RequestMapping("/xiugai")
	public String cha(int fid,Map map) {
		
		Fly chaid = flyDao.chagai(fid);
		
		map.put("chaid", chaid);
		
		return "update";	
	}
	
	//修改
	@RequestMapping("/xiugaiFly")
	public String upFly(Fly fly){
		
		flyDao.update(fly);
		return "redirect:hangxian.fc";
		
		}
	

}

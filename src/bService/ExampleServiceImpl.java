package bService;

import cDao.ExampleDao;
import dModel.ExampleDto;

public class ExampleServiceImpl implements ExampleService{
	
	public ExampleDao dao = ExampleDao.getInstance();
	
	public static ExampleServiceImpl getInstace(){
		return new ExampleServiceImpl();
	}
	
	public ExampleDto loginAction(ExampleDto param) {
		return dao.loginAction(param);
	}

}

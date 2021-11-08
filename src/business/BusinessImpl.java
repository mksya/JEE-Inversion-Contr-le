package business;

import dao.IDao;

public class BusinessImpl implements IBusiness {
	
	//Couplage faible
	private IDao dao=null;

	@Override
	public double calcul() {
		// TODO Auto-generated method stub
		double d = dao.getData();
		double res=d*23;
		return res;
	}


	public void setDao(IDao dao) {
		this.dao = dao;
	}
	
	

}

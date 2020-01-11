/**
 * 
 */
package com.rakuten.prj.client;

import com.rakuten.prj.dao1.MobileDao;
import com.rakuten.prj.dao1.MobileDaoMongoImpl;
import com.rakuten.prj.entity.Mobile;

/**
 * @author vijaya
 *
 */
public class MobileClient {
	public static void main(String[] args)
	{
		Mobile m=new Mobile();
		MobileDao mobileDao=new MobileDaoMongoImpl();
		mobileDao.addMobile(m);
	}

}

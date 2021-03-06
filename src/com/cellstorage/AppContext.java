package com.cellstorage;

import com.example.cellstorage.R;

import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
public class AppContext extends Application{ 
	public String ApplicationName;
    @Override 
    public void onCreate() { 
        // TODO Auto-generated method stub 
        super.onCreate(); 
        ApplicationName = getString(R.string.app_name);
		
    } 
    /*
     * 获取应用版本号
     * return 返回版本号
     * */
	public String getVersionName() throws Exception
	{
       // 获取packagemanager的实例
       PackageManager packageManager = getPackageManager();
       // getPackageName()是你当前类的包名，0代表是获取版本信息
       PackageInfo packInfo = packageManager.getPackageInfo(getPackageName(),0);
       String version = packInfo.versionName;
       return version;
	}
}

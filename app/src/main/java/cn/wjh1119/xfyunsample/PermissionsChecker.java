package cn.wjh1119.xfyunsample;

/**
 * Created by Mr.King on 2017/5/22 0022.
 */

import android.content.Context;
import android.content.pm.PackageManager;
import android.support.v4.content.ContextCompat;

/**
 * 检查权限的工具类
 * Created by holen on 2016/5/13.
 */
public class PermissionsChecker {
    private Context mContext;

    public PermissionsChecker(Context context){
        mContext = context.getApplicationContext();
    }

    /**
     * 判断权限
     */
    public boolean judgePermissions(String...permissions){
        for(String permission:permissions){
            if(deniedPermission(permission)){
                return true;
            }
        }
        return false;
    }

    /**
     * 判断是否缺少权限
     * PackageManager.PERMISSION_GRANTED 授予权限
     * PackageManager.PERMISSION_DENIED 缺少权限
     *
     */
    private boolean deniedPermission(String permission){
        return    ContextCompat.checkSelfPermission(mContext,permission)==                                                    PackageManager.PERMISSION_DENIED;
    }
}

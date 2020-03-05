package com.jon.pattern.aosp.singleton;

public class ActivityManagerNative {

    static public IActivityManager getDefault(){
        return gDefault.get();
    }


    private  static final Singleton<IActivityManager> gDefault = new Singleton<IActivityManager>() {
        @Override
        protected IActivityManager create() {
            System.out.println("IActivityManager");
            return null;
        }
    };



}

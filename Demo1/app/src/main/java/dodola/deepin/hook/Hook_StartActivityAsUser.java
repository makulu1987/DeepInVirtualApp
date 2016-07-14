/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package dodola.deepin.hook;

import dodola.deepin.patch.ActivityManagerPatch;

public class Hook_StartActivityAsUser extends Hook_StartActivity {
    /**
     * 这个构造器必须有,用于依赖注入.
     *
     * @param patchObject 注入对象
     */
    public Hook_StartActivityAsUser(ActivityManagerPatch patchObject) {
        super(patchObject);
    }

    @Override
    public String getName() {
        return "startActivityAsUser";
    }
}

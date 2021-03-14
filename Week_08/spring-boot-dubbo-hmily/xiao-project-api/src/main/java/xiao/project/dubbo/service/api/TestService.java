package xiao.project.dubbo.service.api;

import org.dromara.hmily.annotation.Hmily;

public interface TestService {

    public void ins();
    public void del();
    public void upd();
    public void sel();
    @Hmily
    public void test(String msg);
}

package za.vita.mbeans;

import javax.annotation.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;

import za.vita.service.impl.TaskServiceImpl;


@ManagedBean("test_JmxMBean")
public class JmxTestBean implements IJmxTestBean {

    @Autowired
    protected TaskServiceImpl taskservise;

    @Override
    public String calculateTotals(String orderId) {
        Integer res = (Integer)(taskservise.readAll().size());
        return res.toString();
    }
}
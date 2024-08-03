/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package za.vita.mbeans;

import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.jmx.export.annotation.ManagedOperationParameter;
import org.springframework.jmx.export.annotation.ManagedOperationParameters;
import org.springframework.jmx.export.annotation.ManagedResource;

@ManagedResource(description= "Performs operations on Tasks")
interface IJmxTestBean {
    @ManagedOperation(description="Change priority")
    @ManagedOperationParameters({@ManagedOperationParameter(name="orderId", description ="")})
    String calculateTotals(String orderId);
}

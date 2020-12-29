package com.proto;

import com.protobuf.Models;
import org.junit.Assert;
import org.junit.Test;

import java.util.Objects;

public class ProtoTest {

    @Test
    public void testEmployeeProtoMessage() {
        final Models.Employee employee = Models.Employee.newBuilder()
                .setId(1)
                .setFirstName("Sunil")
                .setLastName("Kulkarni")
                .build();

        Assert.assertTrue(Objects.nonNull(employee));

    }

    @Test
    public void testEmployeeList() {
        final Models.Employee employee = Models.Employee.newBuilder()
                .setId(1)
                .setFirstName("Sunil")
                .setLastName("Kulkarni")
                .build();

        final Models.Employees employees = Models.Employees.newBuilder()
                .addEmployee(employee)
                .build();

        Assert.assertTrue(Objects.nonNull(employees));
        Assert.assertEquals(1, employees.getEmployeeList().size());
    }
}

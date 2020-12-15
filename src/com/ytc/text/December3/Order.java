package com.ytc.text.December3;

import java.util.Date;
import java.util.Objects;

public class Order {


    private Integer orderId;  // 订单编号，
    private String orderDesc;  // 订单描述，
    private String orderPhone;  //联系人电话
    private Date orderDate;  // 下单时间

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order order = (Order) o;
        return Objects.equals(getOrderId(), order.getOrderId()) &&
                Objects.equals(getOrderDesc(), order.getOrderDesc()) &&
                Objects.equals(getOrderPhone(), order.getOrderPhone()) &&
                Objects.equals(getOrderDate(), order.getOrderDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getOrderId(), getOrderDesc(), getOrderPhone(), getOrderDate());
    }

    public Order(Integer orderId, String orderDesc, String orderPhone, Date orderDate) {
        this.orderId = orderId;
        this.orderDesc = orderDesc;
        this.orderPhone = orderPhone;
        this.orderDate = orderDate;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderDesc='" + orderDesc + '\'' +
                ", orderPhone='" + orderPhone.substring(0,3)+"****"+this.orderPhone.substring(6) + '\'' +
                ", orderDate=" + orderDate +
                '}';
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderDesc() {
        return orderDesc;
    }

    public void setOrderDesc(String orderDesc) {
        this.orderDesc = orderDesc;
    }

    public String getOrderPhone() {
        return orderPhone;
    }

    public void setOrderPhone(String orderPhone) {
        this.orderPhone = orderPhone;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
}

class OrderAll {
    public static void main(String[] args) {
        Order[] arr = new Order[]{
                new Order(1, "买个大西瓜", "18021586624", new Date(2018, 01, 15)),

        };

        for (Order order : arr) {

            System.out.println();
        }
    }

    public static Order[] getOrderList(Order[] a) {
        return null;
    }
}
package com.example.basictms.request;

import com.example.basictms.entity.enums.OrderStatus;
import jakarta.persistence.Enumerated;

import java.time.LocalDate;

public class OrderCreationRequest {
    private String startingPoint;
    private String destination;
    private LocalDate startDate;
    private LocalDate endDate;
    @Enumerated
    private OrderStatus orderStatus;
    private double offeredPrice;

    public OrderCreationRequest(String startingPoint, String destination, LocalDate startDate, LocalDate endDate, OrderStatus orderStatus, double offeredPrice) {
        this.startingPoint = startingPoint;
        this.destination = destination;
        this.startDate = startDate;
        this.endDate = endDate;
        this.orderStatus = orderStatus;
        this.offeredPrice = offeredPrice;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getStartingPoint() {
        return startingPoint;
    }

    public void setStartingPoint(String startingPoint) {
        this.startingPoint = startingPoint;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public double getOfferedPrice() {
        return offeredPrice;
    }

    public void setOfferedPrice(double offeredPrice) {
        this.offeredPrice = offeredPrice;
    }

    @Override
    public String toString() {
        return "OrderCreationRequest{" +
                "startingPoint='" + startingPoint + '\'' +
                ", destination='" + destination + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", orderStatus=" + orderStatus +
                ", offeredPrice=" + offeredPrice +
                '}';
    }
}

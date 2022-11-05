package com.greatlearning.graded_project2.skyscrapper_problem.service;

import com.greatlearning.graded_project2.skyscrapper_problem.entity.Floor;

import java.util.PriorityQueue;
import java.util.Stack;

public class FloorAssemblingOrderService {

    Floor[] floorArray;
    Stack<Floor> floorStack;
    PriorityQueue<Floor> floorPriorityQueue;

    public FloorAssemblingOrderService(
            Floor[] floorArray,
            Stack<Floor> floorStack,
            PriorityQueue<Floor> floorPriorityQueue) {

        this.floorArray = floorArray;
        this.floorStack = floorStack;
        this.floorPriorityQueue = floorPriorityQueue;

    }

    public void printFloorAssemblingOrder() {
        System.out.println("The order of construction is as follows");
        for(int i = 0; i<floorArray.length; ++i) {
            floorStack.push(floorArray[i]);
            System.out.println(String.format("Day: [%d]", i+1));
            while(!floorStack.isEmpty() && floorStack.peek().getSize() == floorPriorityQueue.peek().getSize()) {
                System.out.print(floorStack.pop().getSize() + " ");
                floorPriorityQueue.poll();
            }
            System.out.println();
        }
    }
}

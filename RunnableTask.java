/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javathread;

/**
 *
 * @author User
 */
public class RunnableTask  implements Runnable{
    public void run() { 
System.out.println(Thread.currentThread().getId() + " is executing the runnable task."); 
}}

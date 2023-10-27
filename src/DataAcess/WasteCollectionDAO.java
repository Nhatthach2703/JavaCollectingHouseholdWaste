/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataAcess;

import Common.Library;
import java.util.List;

/**
 *
 * @author Xuan Vinh
 */
public class WasteCollectionDAO {
    private static WasteCollectionDAO instance = null;
    Library l;

    public WasteCollectionDAO() {
        l = new Library();
    }

    public static WasteCollectionDAO Instance() {
        if (instance == null) {
            synchronized (WasteCollectionDAO.class) {
                if (instance == null) {
                    instance = new WasteCollectionDAO();
                }
            }
        }
        return instance;
    }

    public void getWaste(List<Integer> stationList) {
        int n = l.getIntNoLimit("How many location you want to input: ");
        int i = 0;
        while (i < n) {
            int input = l.getIntNoLimit("Enter the amount of garbage at each station(in kg): ");
            stationList.add(input);
            i++;
        }

    }

    public float calculateCost(List<Integer> stationList) {
        int totalWaste = 0;
        int time = 0;
        int count = 1;
        for (int i = 0; i < stationList.size(); i++) {
            time += 8;
            if ((totalWaste + stationList.get(i)) >= 10000) {
                time += 30;
                totalWaste = 0;
                count++;
            }
            totalWaste += stationList.get(i);

        }
        if (totalWaste > 0) {
            time += 30;
        }
        float totalTime = (float) time / 60;
        float totalCost = (totalTime * 120000) + (57000 * count);
        return totalCost;
    }

    public void display(List<Integer> stationList) {
        while (true) {
            getWaste(stationList);
            float a = calculateCost(stationList);
            System.out.println("The total cost: " + a + " VND");
            stationList.clear();
            if (!l.checkInputYN("Do you want to continue(Y/N)?: ")) {
                return;
            }
        }
    }
}

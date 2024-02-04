package com.IntelliJ.test1.service;

import java.util.ArrayList;
import java.util.List;

public class Tableau2D {
    public static int remainingLeaves(int width, int height, int[][] leaves, String winds) {
        // Vérifier les cas où leaves est vide
        if (leaves == null || leaves.length == 0) {
            return 0;
        }

        List<int[]> remainingLeavesCoordinates = new ArrayList<>();

        // Initialiser la liste avec les coordonnées des feuilles
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                int numberOfLeaves = leaves[i][j];
                for (int k = 0; k < numberOfLeaves; k++) {
                    remainingLeavesCoordinates.add(new int[]{i, j});
                }
            }
        }

        for (char windDirection : winds.toCharArray()) {
            List<int[]> newRemainingLeavesCoordinates = new ArrayList<>();
            for (int[] leaf : remainingLeavesCoordinates) {
                int i = leaf[0];
                int j = leaf[1];

                switch (windDirection) {
                    case 'U' -> i--;
                    case 'D' -> i++;
                    case 'L' -> j--;
                    case 'R' -> j++;
                }
                // Vérifier si la nouvelle position est toujours dans les limites du tableau
                if (i >= 0 && i < height && j >= 0 && j < width) {
                    // La feuille reste sur l'arbre
                    newRemainingLeavesCoordinates.add(new int[]{i, j});
                }
            }
            remainingLeavesCoordinates = newRemainingLeavesCoordinates;
        }

        return remainingLeavesCoordinates.size();
    }
}

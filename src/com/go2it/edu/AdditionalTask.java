package com.go2it.edu;

  /*Известны результаты каждой из 4х четвертей баскетбольной встречи.
  Нужно определить победителя матча. Побеждает команда,
  набравшая больше очков в течение всего матча.

  Напишите функцию getWinner(points) возвращающую номер победившей команды,
  либо undefined в случае ничьей.*/


import java.util.Locale;

public class AdditionalTask {
    public static int getWinner(String[] res) {
        if (getTotalResForTeam1(res) < getTotalResForTeam2(res)) {
            return 2;
        } else if (getTotalResForTeam2(res) < getTotalResForTeam1(res)) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int getTotalResForTeam1(String[] res) {
        int[] resTeam1 = new int[4];
        int totalResTeam1 = 0;
        for (int i = 0; i < 4; i++) {
            resTeam1[i] = Integer.parseInt(res[i].substring(0, 2));
            totalResTeam1 += resTeam1[i];
        }
        return totalResTeam1;
    }

    public static int getTotalResForTeam2(String[] res) {
        int[] resTeam2 = new int[4];
        int totalResTeam2 = 0;
        for (int i = 0; i < 4; i++) {
            resTeam2[i] = Integer.parseInt(res[i].substring(3, 5));
            totalResTeam2 += resTeam2[i];
        }
        return totalResTeam2;
    }

    public static void main(String[] args) {
        String[] resOfMatch1 = {"23-26", "24-30", "30-27", "35-31"};
        String[] resOfMatch2 = {"36-32", "32-24", "20-28", "30-26"};
        String[] resOfMatch3 = {"36-18", "22-31", "27-21", "19-34"};

        System.out.println(getWinner(resOfMatch1));
        System.out.println(getWinner(resOfMatch2));
        System.out.println(getWinner(resOfMatch3));

        try {
            System.out.println(resOfMatch1[5].toLowerCase(Locale.ROOT));
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception was caught " + e.getMessage());
        }
    }
}


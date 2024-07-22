package com.Chapter4;
import java.time.LocalDate;


public class Calendar {
    public static void printCalendar() {
        // 今天的年月日
        LocalDate date = LocalDate.now();
        int today = date.getDayOfMonth();
        int month = date.getMonthValue();
        int year = date.getYear();



        // 今天所在月份
        LocalDate firstDayOfMonth = date.minusDays(today - 1);
        int firstWeekDay = firstDayOfMonth.getDayOfWeek().getValue();

        // 打印日历抬头
        //TODO: 居中对齐
        System.out.printf("            %4d年%2d月      \n", year, month);
        System.out.print("Mon  Tue  Wed  Thu  Fri  Sat  Sun");

        // 打印月份开始时的空白
        for(int i = 1; i < firstWeekDay; i++)
            System.out.print("   ");


        // 开始打印日历
        int counter = 1;
        do {
            if (counter % 7 == 1)
                System.out.print("\n");
            // 这里注意 printf可以帮助我们预留空格，方便格式化的输出
            System.out.printf("%3d", counter);

            // 对当天的日期做标记
            if (counter == today)
                System.out.print("* ");
            else
                System.out.print("  ");

            // 迭代自增
            counter ++;
            date = firstDayOfMonth.plusDays(counter - 1);

        } while(date.getMonthValue() == month);

    }

    public static void main(String[] args) {
        Calendar.printCalendar();
    }
}

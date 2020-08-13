package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getBucketCount(3.4, 1.5));
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }

        double area = width * height;
        double areaWithExtra = areaPerBucket * extraBuckets;

        double remainingArea = area - areaWithExtra;

        int bucketsNeeded = (int) Math.ceil(remainingArea/areaPerBucket);

        return bucketsNeeded;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        double area = width * height;

        int bucketsNeeded = (int) Math.ceil(area/areaPerBucket);

        return bucketsNeeded;
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        int bucketsNeeded = (int) Math.ceil(area/areaPerBucket);

        return bucketsNeeded;
    }
}

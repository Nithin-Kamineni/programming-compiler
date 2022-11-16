package edu.ufl.cise.plpfa22;

import java.util.Objects;

public class Runtime {

    public static boolean not(boolean arg) {
        return !arg;
    }

    public static boolean lt(int arg1 , int arg2) {
        return arg1 < arg2;
    }

    public static boolean gt(int arg1 , int arg2) {return arg1 > arg2;}

    public static boolean eq(int arg1 , int arg2) {
        return arg1 == arg2;
    }

    public static boolean ntEq(int arg1 , int arg2) {
        return arg1 != arg2;
    }

    public static boolean eq(boolean arg1 , boolean arg2) {
        return arg1 == arg2;
    }

    public static boolean lt(boolean arg1 , boolean arg2) {
        return !arg1 && arg2;
    }

    public static boolean gt(boolean arg1 , boolean arg2) {
        return arg1 && !arg2;
    }

    //suffix
    public static boolean gt(String arg1, String arg2){
        if(Objects.equals(arg1, arg2)){
            return false;
        }
        return arg1.endsWith(arg2);}

    //prefix
    public static boolean lt(String arg1, String arg2){
        if(Objects.equals(arg1, arg2)){
            return false;
        }
        return arg2.startsWith(arg1);
    }

    public static boolean ge(String arg1, String arg2){return arg1.endsWith(arg2);}
    public static boolean le(String arg1, String arg2){return arg2.startsWith(arg1);}


    public static int negate(int arg1){
        return -1 * arg1;
    }
}
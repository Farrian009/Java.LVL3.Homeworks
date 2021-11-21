package test.java;

import HW6.HW6;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class testForArr {

    private HW6 hw6;

    @BeforeEach
    public void init(){
        hw6 = new HW6();
    }

    public static Stream<Arguments> dataExtract (){
        List<Arguments> list = new ArrayList<>();
        list.add(Arguments.arguments(new int[]{1, 7}, new int[]{1, 2, 4, 4, 2, 3, 4, 1, 7}));
        list.add(Arguments.arguments(new int[]{}, new int[]{1, 2, 4, 3, 4}));
        return list.stream();
    }


    @ParameterizedTest
    @MethodSource ("dataExtract")
    public void test1 (int[] a, int[] arr){
        Assertions.assertArrayEquals(a, hw6.arrExtract(arr));
    }

    @Test
    public void test1_2 (){
        int[] arr = new int[]{1, 2, 44, 24, 3, 7};
        Assertions.assertThrows(RuntimeException.class, ()->{
            hw6.arrExtract(arr);
        });
    }

    public static Stream<Arguments> dataCheck (){
        List<Arguments> list = new ArrayList<>();
        list.add(Arguments.arguments(new int[]{1, 1, 1, 1, 1, 1}));
        list.add(Arguments.arguments(new int[]{4, 4, 4, 4}));
        list.add(Arguments.arguments(new int[]{1, 4, 4, 1, 1, 4, 3}));
        return list.stream();
    }


    @ParameterizedTest
    @MethodSource ("dataCheck")
    public void test2 (int[] arr){
        Assertions.assertFalse(hw6.arrCheck(arr));
    }

    @Test
    public void test2_2 (){
        Assertions.assertTrue(hw6.arrCheck(new int[]{1, 1, 1, 4, 4, 1, 4, 4}));
    }
}

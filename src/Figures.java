public class Figures {
    public static void square(){
        for (int i = 0; i <16; i++) {
            for (int j = 0; j <=16; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void fieldA(){
        for (int i = 0; i <8 ; i++) {
            for (int j = 0; j <8-i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
    public static void fieldA_without_body(){
        for (int i = 0; i <8 ; i++) {
            for (int j = 0; j <8-i; j++) {
                if(i==0) {
                    System.out.print("*");
                }
                else{
                    if(j==0 || j==8-i-1){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();

        }
    }
    public static void fieldB(){
        for (int i = 0; i <8 ; i++) {
            for (int j = 0; j <16 ; j++) {
                if(j>=7-i && j<=7+i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void fieldC(){
        for (int i1 = 0; i1<8; i1++) {
            for (int i = 0; i < 16 ; i++) {
                if(i>7+i1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void fieldC_without_body(){
        for (int i1 = 0; i1<8; i1++) {
            for (int i = 0; i < 16 ; i++) {
                if(i1==0 && i>7){
                    System.out.print("*");
                }
                else {
                    if (i1==7 && i==14){
                        System.out.print(" ");
                    }
                    else {
                        if (i == 7 + i1 || i == 15) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                }
            }
            System.out.println();
        }
    }
    public static void fieldD(){
        for (int i = 0; i <16; i++) {
            for (int j = 0; j <16; j++) {
                if (i >= 7) {
                    if (j >= 0 && j <= i - 7) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }

    }
    public static void fieldD_without_body(){
        for (int i = 0; i <16; i++) {
            for (int j = 0; j <16; j++) {
                if(i==15 && j<=7){
                    System.out.print("*");
                }
                else {
                    if (i >= 7) {
                        if (j == 0 || j == i - 7) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();

        }
    }
    public static void fieldF(){
        for (int i = 0; i <16; i++) {
            if(i>7){
                for (int j1 = 0; j1 <16; j1++) {
                    if(j1>22-i){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            else{
                for (int j = 0; j <16; j++) {
                    System.out.print(" ");
                }
            }
            System.out.println();


        }
    }
    public static void fieldF_without_body(){
        for (int i = 0; i <16; i++) {
            if(i>=7 && i<15){
                for (int j1 = 0; j1 <16; j1++) {
                    if(j1==22-i || j1==15){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            else if(i==15){
                for (int j1 = 0; j1 <16; j1++) {
                    if(j1>=7){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }

            }
            else{
                for (int j = 0; j <16; j++) {
                    System.out.print(" ");
                }
            }
            System.out.println();


        }
    }
    public static void fieldE(){
        for (int i = 0; i <16 ; i++) {
            if(i>=7){
                for (int j = 0; j <16 ; j++) {
                    if(j>=i-7&&j<22-i){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            else {
                for (int j = 0; j <16; j++) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void fieldE_without_body(){
        for (int i = 0; i <16 ; i++) {
            if(i>=7){
                if(i==7){
                    for (int j1 = 0; j1 <17 ; j1++) {
                        System.out.print("*");
                    }
                }
                for (int j = 0; j <16 ; j++) {
                    if(i==7){
                        continue;
                    }
                    else {
                        if (j == i - 7 || j == 22 - i+1) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                }
            }
            else {
                for (int j = 0; j <16; j++) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void fieldB_without_body()
    {
        for (int i = 0; i <16; i++) {
            if(i>7){
                System.out.print(" ");
            }
            else {
                for (int j = 0; j < 16; j++) {
                    if (i == 7) {
                        if (j != 15) System.out.print("*");
                    } else {
                        if (j == 7 - i || j == 7 + i) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }

                }
            }
            System.out.println();
        }
    }
    public static void fieldG(){
        for (int i = 0; i <16 ; i++) {
            for (int j = 0; j <16; j++) {
                if(i<=7) {
                    if (j <=7) {
                        if (j>=7-i){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    } else {
                        System.out.print(" ");
                    }
                }
                else{
                    if (j <=7) {
                        if (j>=i-7){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
    public static void fieldG_without_body(){
        for (int i = 0; i <15 ; i++) {
            for (int j = 0; j <16; j++) {
                if(i<=7) {
                    if (j <=7) {
                        if (j ==7 || j==7-i){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    } else {
                        System.out.print(" ");
                    }
                }
                else{
                    if (j <=7) {
                        if (j ==7 || j==i-7){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
    public static void fieldH(){
        for (int i = 0; i <16 ; i++) {
            for (int j = 0; j <16 ; j++) {
                if(i<=7){
                    if(j>=7 && j<=7+i){
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                else{
                    if(j>=7 && j<22-i){
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }

                }
            }
            System.out.println();
        }
    }
    public static void fieldH_without_body(){
        for (int i = 0; i <15 ; i++) {
            for (int j = 0; j <16 ; j++) {
                if(i<=7){
                    if(j==7 || j==7+i){
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                else{
                    if(j==7 || j==22-i-1){
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
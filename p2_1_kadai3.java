public class p2_1_kadai3 {
    public static void main(String[] args){
        //ベクトルa,bを定義
        MyVector vec_A=new MyVector(5, 12);
        MyVector vec_B=new MyVector(4, 9);
        //getVecDimでもとめた次元を新しい配列vecVala、vecValbの配列の長さ、要素を定義
        int a=vec_A.getVecDim();
        int b=vec_B.getVecDim();
        int [] vecVala=new int[a];
        int [] vecValb=new int[b];
        vec_A.getVecVal(vecVala);
        vec_B.getVecVal(vecValb);
        //ベクトルの成分を出力
        System.out.println("Vector: "+vecVala[0]+", "+vecVala[1]);
        System.out.println("Vector: "+vecValb[0]+", "+vecValb[1]);
        vec_A.showVecVal();
        vec_B.showVecVal();
        VectorOperator vectorOperator=new VectorOperator();
        vectorOperator.calcDotProd(vec_A, vec_B);
        vectorOperator.calcTriangleArea(vec_A, vec_B);
        int D=vectorOperator.getDotProdVal();
        double T=vectorOperator.getAreaVal();
        //内積と面積の値を出力
        System.out.println("Dot product: "+D);
        System.out.println("Triangle area: "+T);
    }
}

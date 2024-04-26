public class MyVector {
    int[] m_vecVal;//コンストラクタ
    public MyVector(int val_x,int val_y){//ベクトルのx,y成分
        m_vecVal=new int[2];
        m_vecVal[0]=val_x;
        m_vecVal[1]=val_y;
    }
    public int getVecDim(){//ベクトルの次元
        int r=m_vecVal.length;
        return r;
    }
    public void getVecVal(int [] vecVal){//vecValの配列の要素はm_vecValの配列の要素と同じ
        vecVal[0]=m_vecVal[0];
        vecVal[1]=m_vecVal[1];
    }
    public void showVecVal(){//配列の要素をベクトルa,bそれぞれを出力
        System.out.println("Vector: "+this.m_vecVal[0]+", "+this.m_vecVal[1]);
    }
}

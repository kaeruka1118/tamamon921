public class VectorOperator {
    //コンストラクタ
    int m_dotProd;
    double m_areaVal;
    int[] m_vecVal;
    public void calcDotProd(MyVector vec_a, MyVector vec_b){//ベクトル内積の計算
        m_dotProd=(vec_a.m_vecVal[0]*vec_b.m_vecVal[0]+vec_a.m_vecVal[1]*vec_b.m_vecVal[1]);
    }
    public void calcTriangleArea(MyVector vec_a, MyVector vec_b){//ベクトルの三角形の面積の計算
        m_areaVal=(Math.abs(vec_a.m_vecVal[0]*vec_b.m_vecVal[1]-vec_a.m_vecVal[1]*vec_b.m_vecVal[0])/2.0);
    }
    public int getDotProdVal(){//計算した内積を取得
        return m_dotProd;
    }
    public double getAreaVal(){//計算した面積を取得
        return m_areaVal;
    }
}

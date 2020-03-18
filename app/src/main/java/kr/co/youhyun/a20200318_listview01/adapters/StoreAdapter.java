package kr.co.youhyun.a20200318_listview01.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

import kr.co.youhyun.a20200318_listview01.R;
import kr.co.youhyun.a20200318_listview01.datas.Store;

// alt + enter => 에러 해결 제안
public class StoreAdapter extends ArrayAdapter<Store> {

//    어댑터에서 종종 사용하는 변수 세가지 정의
    Context mContext;  // 화면과의 연결 고리
    List<Store> mList;  // 뿌려줄 데이터 목록을 담고있는 변수
    LayoutInflater inf;  // xml -> 객체화 시켜주는 역할의 클래스

    public StoreAdapter(@NonNull Context context, int resource, @NonNull List<Store> objects) {
        super(context, resource, objects);

//        생성자가 실행될 때 세개의 변수를 채워줌
        mContext = context;
        mList = objects;
        inf = LayoutInflater.from(mContext);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row = convertView;   // row는 지금 그려져야 할 줄을 담는다.

        if (row == null){
//            기존에 그려둔게 없어서(null) 새로 그려야 하나?
//            실제로 그려주자
            row = inf.inflate(R.layout.store_list_item, null);
        }

        return row;
    }
}

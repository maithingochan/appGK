package com.example.appgk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

public class FragmentTrangChu extends Fragment {
        private ListView listView;
        private Nhac_Adapter adapter;
        private ArrayList<Nhac> nhacList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_fragment_trang_chu,container,false);
        listView= view.findViewById(R.id.listview_nhac);
        nhacList = new ArrayList<>();
        nhacList.add(new Nhac("Tên nhạc: Một Phút",R.drawable.motphut,"Tên ca sĩ: Trường Thịnh","Tác giả: Trường thịnh","Mô tả: Khi rảnh rỗi tôi thường nghe nhạc để xua đi nhàm chán và thư giãn. Tôi nghe rất nhiều thể loại nhạc khác nhau. Nhưng thể loại nhạc mà tôi thích nhất là rock ballad. Tôi cực kỳ thích thể loại nhạc này vì nó là sự kết hợp hài hòa của rock và ballad. Tôi thích sự mạnh mẽ của rock nhưng tôi cũng thích sự dịu dàng của ballad và rock ballad đã làm điều này rất tốt. Bài hát mà tôi yêu thích nhất đó là bài “While Your Lips Are Still Red”."));
        nhacList.add(new Nhac("Tên nhạc: Anh Vẫn Ở Đây",R.drawable.anhvanoday,"Tên ca sĩ: Thành Đạt","Tác giả: Thành Đạt","Mô tả: Khi rảnh rỗi tôi thường nghe nhạc để xua đi nhàm chán và thư giãn. Tôi nghe rất nhiều thể loại nhạc khác nhau. Nhưng thể loại nhạc mà tôi thích nhất là rock ballad. Tôi cực kỳ thích thể loại nhạc này vì nó là sự kết hợp hài hòa của rock và ballad. Tôi thích sự mạnh mẽ của rock nhưng tôi cũng thích sự dịu dàng của ballad và rock ballad đã làm điều này rất tốt. Bài hát mà tôi yêu thích nhất đó là bài “While Your Lips Are Still Red”."));
        nhacList.add(new Nhac("Tên nhạc: Hoa Hải Đường",R.drawable.hoahaiduong,"Tên ca sĩ: Jack & K-ICM","Tác giả: Jack","Mô tả: Khi rảnh rỗi tôi thường nghe nhạc để xua đi nhàm chán và thư giãn. Tôi nghe rất nhiều thể loại nhạc khác nhau. Nhưng thể loại nhạc mà tôi thích nhất là rock ballad. Tôi cực kỳ thích thể loại nhạc này vì nó là sự kết hợp hài hòa của rock và ballad. Tôi thích sự mạnh mẽ của rock nhưng tôi cũng thích sự dịu dàng của ballad và rock ballad đã làm điều này rất tốt. Bài hát mà tôi yêu thích nhất đó là bài “While Your Lips Are Still Red”."));
        nhacList.add(new Nhac("Tên nhạc: Người Ấy",R.drawable.nguoiay,"Tên ca sĩ: Anh Tú","Tác giả: Trịnh Thăng Bình","Mô tả: Khi rảnh rỗi tôi thường nghe nhạc để xua đi nhàm chán và thư giãn. Tôi nghe rất nhiều thể loại nhạc khác nhau. Nhưng thể loại nhạc mà tôi thích nhất là rock ballad. Tôi cực kỳ thích thể loại nhạc này vì nó là sự kết hợp hài hòa của rock và ballad. Tôi thích sự mạnh mẽ của rock nhưng tôi cũng thích sự dịu dàng của ballad và rock ballad đã làm điều này rất tốt. Bài hát mà tôi yêu thích nhất đó là bài “While Your Lips Are Still Red”."));
        nhacList.add(new Nhac("Tên nhạc: Rồi Tới Luôn",R.drawable.roitoiluon,"Tên ca sĩ: Đạt-G","Tác giả: Tóc Tiên","Mô tả: Khi rảnh rỗi tôi thường nghe nhạc để xua đi nhàm chán và thư giãn. Tôi nghe rất nhiều thể loại nhạc khác nhau. Nhưng thể loại nhạc mà tôi thích nhất là rock ballad. Tôi cực kỳ thích thể loại nhạc này vì nó là sự kết hợp hài hòa của rock và ballad. Tôi thích sự mạnh mẽ của rock nhưng tôi cũng thích sự dịu dàng của ballad và rock ballad đã làm điều này rất tốt. Bài hát mà tôi yêu thích nhất đó là bài “While Your Lips Are Still Red”."));
        nhacList.add(new Nhac("Tên nhạc: Sóng Gió",R.drawable.songgio,"Tên ca sĩ: Jack & K-ICM","Tác giả: Jack","Mô tả: Khi rảnh rỗi tôi thường nghe nhạc để xua đi nhàm chán và thư giãn. Tôi nghe rất nhiều thể loại nhạc khác nhau. Nhưng thể loại nhạc mà tôi thích nhất là rock ballad. Tôi cực kỳ thích thể loại nhạc này vì nó là sự kết hợp hài hòa của rock và ballad. Tôi thích sự mạnh mẽ của rock nhưng tôi cũng thích sự dịu dàng của ballad và rock ballad đã làm điều này rất tốt. Bài hát mà tôi yêu thích nhất đó là bài “While Your Lips Are Still Red”."));
        nhacList.add(new Nhac("Tên nhạc: Thì Thôi",R.drawable.thithoi,"Tên ca sĩ: Trường Giang","Tác giả: Nhã Phương","Mô tả: Khi rảnh rỗi tôi thường nghe nhạc để xua đi nhàm chán và thư giãn. Tôi nghe rất nhiều thể loại nhạc khác nhau. Nhưng thể loại nhạc mà tôi thích nhất là rock ballad. Tôi cực kỳ thích thể loại nhạc này vì nó là sự kết hợp hài hòa của rock và ballad. Tôi thích sự mạnh mẽ của rock nhưng tôi cũng thích sự dịu dàng của ballad và rock ballad đã làm điều này rất tốt. Bài hát mà tôi yêu thích nhất đó là bài “While Your Lips Are Still Red”."));
        nhacList.add(new Nhac("Tên nhạc: Túy Âm",R.drawable.tuyam,"Tên ca sĩ: Sơn Tùng","Tác giả: Only-C","Mô tả: Khi rảnh rỗi tôi thường nghe nhạc để xua đi nhàm chán và thư giãn. Tôi nghe rất nhiều thể loại nhạc khác nhau. Nhưng thể loại nhạc mà tôi thích nhất là rock ballad. Tôi cực kỳ thích thể loại nhạc này vì nó là sự kết hợp hài hòa của rock và ballad. Tôi thích sự mạnh mẽ của rock nhưng tôi cũng thích sự dịu dàng của ballad và rock ballad đã làm điều này rất tốt. Bài hát mà tôi yêu thích nhất đó là bài “While Your Lips Are Still Red”."));
        nhacList.add(new Nhac("Tên nhạc: Yêu 5",R.drawable.yeu5,"Tên ca sĩ: Rammatics","Tác giả: Long Lor","Mô tả: Khi rảnh rỗi tôi thường nghe nhạc để xua đi nhàm chán và thư giãn. Tôi nghe rất nhiều thể loại nhạc khác nhau. Nhưng thể loại nhạc mà tôi thích nhất là rock ballad. Tôi cực kỳ thích thể loại nhạc này vì nó là sự kết hợp hài hòa của rock và ballad. Tôi thích sự mạnh mẽ của rock nhưng tôi cũng thích sự dịu dàng của ballad và rock ballad đã làm điều này rất tốt. Bài hát mà tôi yêu thích nhất đó là bài “While Your Lips Are Still Red”."));
        nhacList.add(new Nhac("Tên nhạc: Hồng Nhan",R.drawable.hongnhan,"Tên ca sĩ: Jack & K-ICM","Tác giả: Jack","Mô tả: Khi rảnh rỗi tôi thường nghe nhạc để xua đi nhàm chán và thư giãn. Tôi nghe rất nhiều thể loại nhạc khác nhau. Nhưng thể loại nhạc mà tôi thích nhất là rock ballad. Tôi cực kỳ thích thể loại nhạc này vì nó là sự kết hợp hài hòa của rock và ballad. Tôi thích sự mạnh mẽ của rock nhưng tôi cũng thích sự dịu dàng của ballad và rock ballad đã làm điều này rất tốt. Bài hát mà tôi yêu thích nhất đó là bài “While Your Lips Are Still Red”."));

        adapter= new Nhac_Adapter(getContext(),R.layout.custom_itemnhac,nhacList);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getContext(),MoTa.class);
                intent.putExtra("key1",nhacList.get(i).getImg());
                intent.putExtra("key2",nhacList.get(i).getTenNhac());
                intent.putExtra("key3",nhacList.get(i).getTacGia());
                intent.putExtra("key4",nhacList.get(i).getTenCaSi());
                intent.putExtra("key5",nhacList.get(i).getMoTa());
                startActivity(intent);
            }
        });



        return view;
    }
}
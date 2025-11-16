package com.example.demo.Childs;

import com.example.demo.Extends.*;
import com.example.demo.Implements.*;
import com.example.demo.Business.*;



public class Child extends Base implements Size {

    private final IBusiness business;

    // <editor-fold desc="childクラスオリジナルメソッド">
    /**
     * Businessクラスのメソッドを用いてプロパティのサイズを変更する
     */
    public void ChangeSize(){
        var AlternativeSize = business.ExchangeSize(this.size);

        if(AlternativeSize < 100){
            this.size = (int)(AlternativeSize * 2);
        }else{
            this.size = (int)(AlternativeSize * 0.5);
        }
    }
    // </editor-fold>
    
    // <editor-fold desc="抽象クラスにあるメソッドをオーバーライド">
    /**
     * Childクラスのコンストラクタ
     * @param name
     * @param age
     */
    public Child(String name, int age, IBusiness bus) {
        super(name, age); // Base のコンストラクタを呼ぶ

        this.business = bus;
    }

    // greet() をオーバーライドしてみる
    @Override
    public String greet() {
        return String.format("Hello %s, age %d, size %s", name, age, size);
    }
    // farewell() はそのまま Base の実装を使う

    // </editor-fold>

    // <editor-fold desc="インターフェイスにあるメソッドを実装(SetterとGetterを定義)">
    @Override
    public int getSize() {
        return size; // 実装クラスのプロパティにアクセス
    }

    @Override
    public void setSize(int size) {
        this.size = size;
    }
    // </editor-fold>
}

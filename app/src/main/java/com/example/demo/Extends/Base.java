package com.example.demo.Extends;

// ファイル名: Base.java
public class Base {

	// プロパティ（フィールド）
	protected String name;
	protected int age;
	protected int size = 120;

    /**
		 * Baseクラスのコンストラクタ
		 * @param name
		 * @param age
		 */
    public Base(String name, int age) {
        this.name = name;
        this.age = age;
    }

		/**
		 * 会った時の挨拶をする
		 * @return
		 */
  	public String greet() {
        return "Hello!";
    }

		/**
		 * さようならの挨拶をする
		 */
    public void farewell() {
        System.out.println("Goodbye from Base!");
    }
}


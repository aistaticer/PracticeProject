package com.example.demo.Implements;

public interface Size {
	/**
	 * sizeプロパティの値を取得
	 */
	public int getSize();

	/**
	 * sizeプロパティの値を変更
	 */
	public void setSize(int size);

	/**
	 * サイズをインターフェイスのデフォルト実装から変更する
	 * @param resize
	 */
	default void resize(int resize){
		setSize(resize);
	}
}

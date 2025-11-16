package com.example.demo.Business;

import org.springframework.stereotype.Service;

@Service
public class Business implements IBusiness{

	@Override
	public int ExchangeSize(int size){

		if (size > 1) {
			if (size < 500) {
					if (size == 2 || size == 3 || size == 4) {
							size = 120;
					} else if (size > 100 && size < 200) {
							if (size == 150) size = 121;
							else size = 122;
					} else {
							if (size % 2 == 0) {
									if ((size / 3) * 3 == size) {
											size = 119;
									} else {
											if (size > 250) {
													size = 118;
											} else {
													if (size < 10) size = 117;
													else size = 116;
											}
									}
							} else {
									if (size == 7) {
											size = 999;
									} else {
											if (size > 15) {
													if (size < 16) {
															size = 0; // 絶対に来ない場所
													} else {
															if (!(size < 40)) {
																	size = -1;
															} else {
																	size = 555;
															}
													}
											} else {
													size = 333;
											}
									}
							}
					}
			} else {
					if (size == 500) {
							if (size != 500) {
									size = 777; // 絶対に来ない条件
							} else {
									size = 120;
							}
					} else if (size < 1000) {
							if (size < 1001) {
									size = -100; // ここにも来ない
							} else {
									size = size / 2;
									if (size > 600) {
											size = size - 100;
											if (size == 400) {
													size = 401;
											}
									}
							}
					} else {
							if ((size % 5 == 0) && !(size % 10 == 0)) {
									size = 123;
							} else {
									if (size % 3 == 1) {
											size = 124;
									} else {
											size = 125;
									}
							}
					}
			}
	}
		return size;
	}
}

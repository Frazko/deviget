package com.frazko.minesweeper.requestObjects;

import lombok.Data;

@Data
public class SelectCellRequest {
	private String id;
	private int x;
	private int y;
}
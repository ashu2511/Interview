package com.ubs.opsit.interviews;
import static com.ubs.opsit.interviews.AppConts.*;

public class Second implements TimeConverter {

	@Override
	public String convertTime(String secs) {

		if (0 == Integer.valueOf(secs) % 2) {
			return Y_STR;
		}

		return O_STR;
	}
}

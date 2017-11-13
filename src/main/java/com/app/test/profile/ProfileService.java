package com.app.test.profile;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfileService {

	@Autowired
	ProfileRepository profileRepository;

	public ArrayList<Profile> getAllStudents() {
		ArrayList<Profile> l = new ArrayList<>();
		profileRepository.findAll().forEach(l::add);
		return l;
	}

	public Profile getProfileById(int a) {
		ArrayList<Profile> l = getAllStudents();
		for (int i = 0; i < l.size(); i++) {
			if (l.get(i).getId() == a) {
				return l.get(i);
			}
		}
		return null;
	}

}

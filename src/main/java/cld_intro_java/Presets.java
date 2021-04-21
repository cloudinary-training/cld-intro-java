package cld_intro_java;

import com.cloudinary.Api;
import com.cloudinary.Cloudinary;

public class Presets {
	public static void runner(Cloudinary cloudinary) {
		try {

		} catch (Error e) {
			System.out.println(e.getLocalizedMessage());
		}
	}

	public static void main(String[] args) throws Exception {
		Cloudinary cloudinary = new Cloudinary();
		Api api = cloudinary.api();
		// Unsigned Presets
		// Create an unsigned upload preset
		// System.out.println(api.createUploadPreset(ObjectUtils.asMap("name",
		// "unsigned-image", "unsigned", true, "tags" , "unsigned",
		// "allowed_formats","jpg,png")));

		// Use unsigned preset
		// System.out.println(cloudinary.uploader().upload("./assets/logo.png",
		// ObjectUtils.asMap("upload_preset","unsigned-image")));

		// Create signed preset
		// System.out.println(api.createUploadPreset(ObjectUtils.asMap("name",
		// "signed-image", "unsigned", false, "tags" , "signed",
		// "allowed_formats","jpg,png")));

		// Use signed preset
		// System.out.println(cloudinary.uploader().upload("./assets/lake.png",
		// ObjectUtils.asMap("upload_preset","signed-image")));

	}

}
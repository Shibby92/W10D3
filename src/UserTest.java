import java.io.*;

public class UserTest {

	public static void main(String[] args) {
		User u = new User("Haris", 22, true);
		File users = new File(
				"/Users/harisarifovic/Documents/workspace/W10D3/Users/Users.txt");
		FileInputStream fis;
		try {
			fis = new FileInputStream(users);
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);
			String line = null;
			line = br.readLine();
			if (line == null) {
				writeUser(u, users);
			} else {
				readUser(u, users);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static void readUser(User u, File users) {
		try {

			FileInputStream fis = new FileInputStream(users);
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);
			String line = null;
			line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static void writeUser(User u, File users)
			throws FileNotFoundException {
		FileOutputStream fos;
		try {
			fos = new FileOutputStream(users);
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(osw);
			bw.write(u.toString());
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

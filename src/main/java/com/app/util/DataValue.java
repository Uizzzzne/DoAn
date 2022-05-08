package com.app.util;

public class DataValue {

    public static final String[] BRAND_NAME = {
            "Omachi", "Vinamilk", "Oishi", "Orion", "Lays",
            "Coca", "Pepsi", "Vissan", "Cooking Tường An", "Acecook",
            "Vifon", "Kool", "Udon", "Reeva", "Koreno",
            "Dutch lady", "Nestle", "TH true milk", "Taky"};

    public static final String[] GOOD_GROUP_NAME = {
            "Thịt", "Hải sản", "Rau củ", "Trái cây",
            "Bánh kẹo", "Đồ uống", "Sữa", "Đồ ăn liền",
            "Gạo, bột", "Gia vị", "Dầu ăn"
    };

    public static final String[] CATEGORY_NAME = {
            "Thịt heo", "Thịt bò", "Thịt gà", "Thịt dê", "Thịt cừu",
            "Cá biển", "Cá sông", "Tôm, tép", "Cua", "Mực, bạch tuộc",
            "Rau xanh", "Củ, quả", "Nấm", "Rau củ sơ chế", "Rau củ hữu cơ",
            "Trái cây nội địa", "Trái cây nhập", "Trái cây tươi", "Trái cây sấy", null,
            "Snack các loại", "Bánh quy", "Kẹo các loại", "Mứt, thạch các loại", "Ăn vặt",
            "Nước ngọt", "Cafe", "Trà", "Nước suối, nước khoáng", "Trà sữa",
            "Sữa tươi các loại", "Sữa hạt, sữa đậu", "Sữa đặc", "Ngũ cốc, ca cao", "Sữa chua",
            "Mì gói", "Phở, hủ tiếu, miến", "Cháo ăn liền", "Bánh gạo Hàn Quốc", null,
            "Ngũ cốc, yến mạch", "Đậu các loại", "Gạo các loại", null, null,
            "Đường, muối", "Gia vị nêm sẵn", "Tương các loại", "Nước chấm", "Hạt nêm, bột ngọt",
            null, null, null, null, null
    };

    public static final String[] DESCRIPTION = {
            "I tried this place last week and it was incredible! Amazing selection of local and imported brews and the food is to die for! ",
            "hipsters everywhere", "Always a great spot to grab a coffee with a friend. ", "Great ramen, a little pricey for what you get. ", "Tried this place with my wife last week and it was incredible. ",
            "Pretty good soups. ", "If you need a great place with bangin' food that is open late, look no further than work.  ", "$12 Banana smoothies. I'd skip this one next time. ", "bok bok bok", "Great spot for Brunch ",
            "I only wish I could find them before they were all sold out! ", "Oysters are amazing here as are the cocktails. ", "A little expensive but the ambiance is great. ", "I ate so much here. ", "I'm not a fancy dude but this place is the cat's meow. ",
            "Try the sour patch kids for dessert. ", "My middle name is charcuterie ", "The coffee was too hot!", "Who pays $15 for Mr Noodles?! ", "Mary and I enjoyed the wine here. ",
            "Soup was too hot!", "HIPSTERS GET OUT OF MY CITY", "When I was a kid we ate salad ", "Now this is a place that I can get behind!", "I like things that are consistent ",
            "Tim Hortons has nothin' on this monster", "I ate at this place and I had two black something the next day", "I prefer Taco Bell", "Nice waitress here", "Best coffee in town! ",
            "I could eat ramen eggs all day long", "This pizza is the", "Meh Soup ", "Nothing better than a PBR after a long day of social media ", "Too Expensive ",
            "A+ Chicken", "Eggs Benny", "The best doughnuts in the world", "Fantastic Selection of cocktails ", "I could eat these tacos every day for the rest of my life ",
            "Pretty good but not worth the hype. "
    };

    public static final String[] ACCOUNT_FULLNAME = {"Mai Xuân Hoàng", "Tô Thị Hồng Thắm", "Nguyễn Trọng Hảo", "Nguyễn Tấn Lộc", "Nguyễn Văn Tính", "Trương Công Cường", "Mai Minh Thư", "Điểu Long", "Dương Cát Luynh", "Đặng Trường An",
            "Lê Chí Bảo", "Nguyễn Anh Tuấn", "Đỗ Thị Thu Diệp", "Võ Anh Hào", "Vũ Trung Kiên", "Nguyễn Quang Đức", "Nguyễn Hoàng Lâm", "Nguyễn Thanh Hoài", "Nguyễn Thị Kiều Oanh", "Nguyễn Ngọc Trường",
            "Nguyễn Hưng Phát", "Trần Hồng Thịnh", "Nguyễn Văn Hùng", "Tạ Minh Đức", "Trần Quang Triệu", "Lê Tuấn Khang", "Nguyễn Nhật Hào", "Lê Khắc Trung", "Nguyễn Phan Huỳnh Đức", "Tằng Tiến Đạt",
            "Lục Gia Anh", "Vũ Văn Khải", "Nguyễn Hoàng Nhật", "Nguyễn Thị Hoàng Nhi", "Nguyễn Tấn Toàn", "Lê Quang Nhật", "Bùi Thị Mỹ Duyên", "Nguyễn Phúc Thịnh", "Lê Dĩ Khang", "Lê Trần Tuấn Thành",
            "Văn Minh Hoàng", "Phạm Thái Sơn", "Thái Anh Hào", "Đặng Lê Nguyên Lương", "Đỗ Đạt Đức", "Thiều Quang Nghĩa", "Trương Tuấn Phúc", "Cao Thành Đạt", "Phan Xuân Bách", "Hoàng Thiên Thảo",
            "Hoàng Hữu Hiển", "Phạm Quí Phong", "Nguyễn Tuấn Anh", "Dương Anh Tú", "Huỳnh Ngọc Hoàng Phúc", "Lê Nhật Huy", "Nguyễn Tấn Lợi", "Trương Đình Phước", "Nguyễn Đức Huy", "Nguyễn Hữu Thắng",
            "Trần Thái Minh Tân", "Trần Trung Vinh", "Lê Đình Huy", "Nguyễn Hồng Sơn", "Nguyễn Duy Thiện", "Dương Thị Diễm", "Nguyễn Xuân Thìn", "Nguyễn Hiếu Học", "Hà Hiếu Uyên", "Võ Đại Quyền",
            "Phan Huy Quỳnh", "Phùng Khánh Toàn", "Nguyễn Mạnh Trường", "Trần Đông Hoàng", "Đoàn Thị Thanh Hồng", "Nguyễn Văn Mỹ", "Tống Sỹ Nguyên", "Nguyễn Trần Ngọc Tới", "Phạm Ngọc Như ý", "Phan Thị Tứ Thi",
            "Lê Ngọc Tồn", "Vũ Đình Khánh Đăng", "Nguyễn Trần Nhật Hào", "Nguyễn Mai Anh", "Nguyễn Thanh Tú", "Lê Thị Nguyên", "Hà Huy Hoàng", "Hồ Minh Phúc", "Võ Thanh Nhàn", "Hoàng Xuân Khang",
            "Nguyễn Bảo Hòa", "Nguyễn Công Thành Đạt", "Phùng Thanh Toàn", "Võ Tấn Nguyên", "Ngô Quang Long", "Đoàn Văn Vĩnh", "Trần Xuân Quang", "Trần Vũ Hoàng Sơn", "Châu Quốc An", "Bùi Thành Nam",
            "Phạm Thành Khoa", "Mai Lộc", "Huỳnh Thanh Bình", "Nguyễn Xuân Hải", "Trần Phạm Gia Long", "Nguyễn Thiên Cát Tường", "Nguyễn Trần Nhật Hưng", "Võ Thanh Thế", "Trần Minh Nghĩa", "Trần Cao Tường",
            "Nguyễn Thế Hậu", "Lê An Thịnh Phát", "Đinh Thị Hà Phương", "ứng Ngọc Sơn", "Nguyễn Văn Chiến", "Võ Huỳnh Bảo Khương", "Huỳnh Nguyễn Đức Hưng", "Hồ Dương Vũ", "Lê Danh Huy", "Nguyễn Văn Anh",
            "Hà Danh Phúc", "Nguyễn Phước Nguyên Ân", "Phạm Anh Tuấn", "Nguyễn Thành Luân", "Phạm Lê Thành", "Phạm Xuân Lộc", "Nguyễn Ngọc Bảo Duy", "Thái Huy Hoàng", "Nguyễn Thanh Liêm", "Lê Tuấn Tú",
            "Mai Kiên Cường", "Nguyễn Huy Hảo", "Trần Chí Hùng", "Lương Thanh Nhất", "Nguyễn Ngọc Hà", "Nguyễn Thị Thanh Thúy", "Nguyễn Anh Khoa", "Lưu Tuấn Kha", "Võ Đức Hoàng", "Nguyễn Văn Tâm",
            "Trần Hoàng Phúc", "Phan Võ Nhật Hoàng", "Nguyễn Hoàng Phúc Liêm", "Nguyễn Thị Quỳnh Mai", "Nguyễn Đình Hoàng Phương", "Võ Minh Vương", "Lê Nhật Uyên Hương", "Huỳnh Anh Tiên", "Nguyễn Hoàng Việt", "Bùi Lâm Vĩnh",
            "Nguyễn Hoàng Nhật Minh", "Trần Phạm Hải Âu", "Nguyễn Đức Duy", "Nguyễn Thế Đạt", "Nguyễn Hữu Lộc", "Bùi Hoàng Phát", "Nguyễn Như Hà", "Lưu Hoàng Long", "Nguyễn Đinh Hoàng Mỹ", "Nguyễn Trung Hải",
            "Nguyễn Văn Vương", "Nguyễn Đức Mạnh", "Nguyễn Ngọc Trí", "Võ Minh Thiện", "Trần Hoài Phong", "Mai Thanh Trọng", "Phan Duy Tuấn", "Vương Cẩm Phong", "Nguyễn Việt Tiến", "Nguyễn Anh Huy",
            "Tô Văn Hậu", "Phạm Xuân Vũ", "Trần Trọng Thành", "Võ Văn Nghĩa", "Nguyễn Văn Lên", "Nguyễn Trọng Nhân", "Võ Quốc Khánh", "Mai Phát Huy", "Phạm Quốc Toàn", "Phạm Tuấn Đạt",
            "Nguyễn Thế Bảo", "Nguyễn Huỳnh Công Lý", "Phan Văn Thông", "Lê Thiên Tân", "Nguyễn Ngọc Mỹ", "Phạm Thị Thanh Ngân", "Bùi Quốc Thanh", "Trương Đức Hoàn", "Nguyễn Tấn Hưng", "Trần Ngọc Hiển",
            "Trương Nhật Long"};

    public static final String[] ACCOUNT_PHONE_NUMBER = {"0913973814", "0913634820", "0903136974", "0903673771", "0913931777", "0913437225", "0903501858", "0903351248", "0913386037", "0903731434",
            "0903710529", "0913408963", "0903703837", "0903776919", "0903982407", "0913706500", "0913508120", "0913439611", "0913367191", "0913792401",
            "0903144539", "0913636382", "0903276121", "0903510491", "0903304434", "0903332055", "0913469421", "0903370527", "0913676340", "0913820810",
            "0913653245", "0913820846", "0913959223", "0903641479", "0913796000", "0903851555", "0913121959", "0903659537", "0903978246", "0913495864",
            "0903982519", "0903866773", "0903406493", "0903206388", "0903219089", "0903848276", "0913202254", "0913348228", "0903166410", "0903618541",
            "0903626632", "0903134597", "0903874499", "0903721029", "0913181060", "0913488827", "0903215666", "0903243287", "0903602003", "0903709062",
            "0903601592", "0913588226", "0903633761", "0903556528", "0903114285", "0903802022", "0913488707", "0913785995", "0903261344", "0903914356",
            "0913664502", "0903178150", "0903804005", "0903117348", "0903769339", "0913798595", "0903656013", "0913706649", "0913126857", "0903446551",
            "0903133485", "0913678424", "0913592984", "0913549239", "0913861364", "0913833404", "0913525708", "0903217956", "0903818365", "0913136290",
            "0913273165", "0913701180", "0903570650", "0913893133", "0903675458", "0903158767", "0913240079", "0903347142", "0913472823", "0903810466",
            "0903970344", "0913251020", "0913480765", "0913189986", "0913841346", "0913406347", "0903565463", "0913766448", "0913500572", "0903448842",
            "0913250835", "0903791628", "0903141140", "0903833076", "0903942849", "0903159674", "0913135899", "0903657001", "0903783822", "0903891015",
            "0903293339", "0913794315", "0913118608", "0913163633", "0903810565", "0903243159", "0913738567", "0913529818", "0903805703", "0903828978",
            "0913490200", "0913833965", "0913457583", "0903178793", "0903104181", "0913727387", "0903232503", "0913370322", "0913702772", "0913728596",
            "0913542231", "0913103708", "0903796326", "0913554059", "0913576053", "0903409121", "0913370224", "0903707749", "0913386323", "0913940058",
            "0913752821", "0903919767", "0913468089", "0913177200", "0903766357", "0913816446", "0913171569", "0913333020", "0913859325", "0903280516",
            "0913766731", "0913401669", "0913638543", "0903538689", "0913864356", "0903330861", "0903588874", "0913119609", "0913332185", "0913557341",
            "0913289713", "0913545500", "0913686423", "0903600918", "0913520111", "0903596863", "0903727968", "0903549087", "0903768428", "0913542452",
            "0913562365", "0903530873", "0913231161", "0913944228", "0903946784", "0913660296", "0903442158", "0903535819", "0903181921", "0913757135",
            "0903391269", "0913406023", "0903765694", "0903233067", "0913433034", "0913822202", "0903355164", "0903572214", "0903687563", "0913434473",
            "0903895216", "0913676176", "0913808450", "0903145525", "0903393881", "0903973917", "0903976655", "0913185878", "0913941588", "0903408714",
            "0903801752", "0903943200", "0913830970", "0903286801", "0913127479", "0903913569", "0903488263", "0913963377", "0913838635", "0903819969",
            "0903551634", "0903123860", "0903154880", "0913695804", "0913660532", "0903736974", "0913463363", "0903114006", "0913585323", "0903519192",
            "0903281461", "0903573990", "0913243648", "0903116644", "0913620880", "0903275107", "0913186856", "0903276851", "0913265630", "0903493328",
            "0913139392", "0903125987", "0913172264", "0913333067", "0903991467", "0903905994", "0903769979", "0913585301", "0903737725", "0903863455",
            "0903235873", "0903234907", "0903386689", "0903236870", "0903890710", "0913508205", "0903129349", "0903582459", "0913355184", "0903335959",
            "0903169366", "0913816940", "0903829585", "0903957138", "0913409496", "0903795102", "0913366041", "0913473325", "0903399738", "0913790174",
            "0913176238", "0913424043", "0903860605", "0913729801", "0903881824", "0913311101", "0903433278", "0913535492", "0903130893", "0903981368",
            "0913190289", "0913360222", "0903259600", "0913445802", "0903817983", "0913757836", "0913685719", "0903718362", "0903132431", "0903877412",
            "0913523692", "0913870932", "0903439276", "0913936861", "0913411528", "0913149837", "0913553896", "0903380670", "0903443803", "0913609920",
            "0903879505", "0913843949", "0913177079", "0913957710", "0913471171", "0913844169", "0903386622", "0913106151", "0913422265", "0903264848",
            "0913745836", "0913873137", "0903397631", "0903724181", "0903768825", "0913779549", "0913870174", "0903466088", "0913434638", "0913311892",
            "0903331265", "0913876585", "0903715747", "0903489067", "0903248212", "0913399744", "0903439906", "0913391153", "0903292043", "0903868716",
            "0913366563", "0913372130", "0903791421", "0913393487", "0913451683", "0913865626", "0913198614", "0903337180", "0913609816", "0903749894",
            "0903531003", "0913362309", "0913671701", "0913373322", "0913705589", "0903900951", "0913921309", "0903348239", "0903551057", "0913888591",
            "0903607579", "0913554897", "0903593295", "0913980692", "0903152017", "0913170939", "0913821858", "0903982047", "0913246200", "0903478789",
            "0913921180", "0913143484", "0913260402", "0903304139", "0913801728", "0903170702", "0913407734", "0913528721", "0903289594", "0903722505",
            "0903809899", "0913103652", "0913536616", "0913384869", "0903191759", "0903179749", "0913812520", "0903498688", "0913658606", "0913260437",
            "0903665700", "0913934653", "0903943851", "0913756645", "0913224127", "0903477762", "0913331008", "0903722831"};

    public static final String[] ACCOUNT_ADDRESS = {"Phạm Ngọc Thạch, Xã Thạnh An, Cần Giờ, TPHCM", "5, Xã Nhị Bình, Hóc Môn, TPHCM", "Hòa Mỹ, Phường Phạm Ngũ Lão, Quận 1, TPHCM", "Huỳnh Văn Bánh, Phường 1, Phú Nhuận, TPHCM", "Tân Quy, Xã Phước Hiệp, Củ Chi, TPHCM",
            "Phú Định, Phường 13, Quận 8, TPHCM", "Dương Vũ Tùng, Phường 22, Bình Thạnh, TPHCM", "Kênh Tân Hóa, Phường Hòa Thạnh, Tân Phú, TPHCM", "Sầm Sơn, Phường 14, Tân Bình, TPHCM", "D3, Phường Bình Trị Đông B, Bình Tân, TPHCM",
            "Phạm Văn Đồng, Phường 5, Bình Thạnh, TPHCM", "Trần Quang Diệu, Phường 8, Phú Nhuận, TPHCM", "Nguyễn Hữu Hãn, Phường 12, Quận 4, TPHCM", "Số 11, Phường 15, Quận 11, TPHCM", "9, Phường  Hóc Môn, Hóc Môn, TPHCM",
            "T5, Thị trấn Tân Túc, Bình Chánh, TPHCM", "Đào Tông Nguyên, Thị trấn Nhà Bè, Nhà Bè, TPHCM", "Xã Đê, Xã Phong Phú, Bình Chánh, TPHCM", "Tỉnh lộ 9, Xã Thới Tam Thôn, Hóc Môn, TPHCM", "1, Phường 6, Tân Bình, TPHCM",
            "Tôn Thất Tùng, Phường Đa Kao, Quận 1, TPHCM", "5, Phường Tân Thới Nhất, Quận 12, TPHCM", "Phạm Hữu Chí, Phường 4, Quận 5, TPHCM", "Thạnh Lộc 21, Phường Tân Chánh Hiệp, Quận 12, TPHCM", "Liên Ấp 26, Phường An Lạc A, Bình Tân, TPHCM",
            "Duyên Hải, Xã Lý Nhơn, Cần Giờ, TPHCM", "Đỗ Ngọc Thạnh, Phường 2, Quận 11, TPHCM", "Ngô Quyền, Phường Sơn Kỳ, Tân Phú, TPHCM", "45, Phường 6, Tân Bình, TPHCM", "Xuân Thịnh, Phường Cát Lái, Quận 2, TPHCM",
            "Số 28, Phường 8, Quận 11, TPHCM", "CC3, Phường Tây Thạnh, Tân Phú, TPHCM", "Số 14, Thị trấn Nhà Bè, Nhà Bè, TPHCM", "Chu Văn An, Phường 1, Quận 6, TPHCM", "Số 9, Phường 13, Quận 11, TPHCM",
            "Trương Minh Giảng, Phường 11, Gò Vấp, TPHCM", "D15, Phường Trường Thọ, Thủ Đức, TPHCM", "Tân Trào, Phường Phú Mỹ, Quận 7, TPHCM", "Hoàng Minh Giám, Phường 11, Phú Nhuận, TPHCM", "Doi Lầu, Xã Long Hòa, Cần Giờ, TPHCM",
            "Đỗ Bí, Phường Phú Trung, Tân Phú, TPHCM", "Công Lý, Phường Tam Phú, Thủ Đức, TPHCM", "Cư Xá Phú Lâm, Phường 7, Quận 6, TPHCM", "Nguyễn Huy Thông, Phường 16, Gò Vấp, TPHCM", "37A, Phường Cát Lái, Quận 2, TPHCM",
            "Châu Văn Liêm, Phường 9, Quận 11, TPHCM", "F21, Phường Thảo Điền, Quận 2, TPHCM", "Hương lộ 60, Phường Bà Điểm, Hóc Môn, TPHCM", "D823, Xã Trung Lập Hạ, Củ Chi, TPHCM", "Nguyễn Thị Nhỏ, Phường 7, Quận 10, TPHCM",
            "Giải Phóng, Phường 1, Tân Bình, TPHCM", "Thạnh Xuân 21, Phường 16, Quận 8, TPHCM", "N6, Xã Long Thới, Nhà Bè, TPHCM", "Vành Đai 2, Phường 12, Quận 8, TPHCM", "Trần Huy Liệu, Phường 14, Phú Nhuận, TPHCM",
            "34, Phường 8, Quận 4, TPHCM", "Thới An 07, Phường Tân Thới Nhất, Quận 12, TPHCM", "12C, Phường 6, Quận 4, TPHCM", "Số 35, Phường Long Bình, Quận 9, TPHCM", "21, Phường 6, Quận 4, TPHCM",
            "Đỗ Văn Sửu, Phường 7, Quận 5, TPHCM", "Ngô Bệ, Phường 2, Tân Bình, TPHCM", "Đặng Tất, Phường Cô Giang, Quận 1, TPHCM", "Số 6, Phường 8, Quận 11, TPHCM", "Đào Duy Từ, Phường 4, Phú Nhuận, TPHCM",
            "Võ Văn Kiệt, Phường Nguyễn Cư Trinh, Quận 1, TPHCM", "C9, Phường Tân Quy, Quận 7, TPHCM", "6, Phường 25, Bình Thạnh, TPHCM", "Lê Thị Chừng, Xã Bình Mỹ, Củ Chi, TPHCM", "Triệu Quang Phục, Phường 9, Quận 5, TPHCM",
            "M7, Phường Bình Khánh, Quận 2, TPHCM", "Công Trường Tự Do, Phường 14, Bình Thạnh, TPHCM", "Tái Thiết, Phường 3, Tân Bình, TPHCM", "10, Phường 9, Quận 6, TPHCM", "Trường Sa, Phường Cô Giang, Quận 1, TPHCM",
            "Huỳnh Khương An, Phường Bến Thành, Quận 1, TPHCM", "Lê Thị Kim, Xã Đa Phước, Bình Chánh, TPHCM", "3/2, Phường 10, Quận 11, TPHCM", "TK14, Xã Nhị Bình, Hóc Môn, TPHCM", "Hưng Gia 5, Phường Tân Kiểng, Quận 7, TPHCM",
            "C5, Phường 7, Quận 8, TPHCM", "K1, Xã Trung Chánh, Hóc Môn, TPHCM", "Số 36, Phường 1, Quận 4, TPHCM", "Số 42, Phường Linh Đông, Thủ Đức, TPHCM", "Tân Canh, Phường 1, Tân Bình, TPHCM",
            "Số 9, Thị trấn Tân Túc, Bình Chánh, TPHCM", "Trường Lưu 2, Phường Tăng Nhơn Phú B, Quận 9, TPHCM", "Số 4E, Thị trấn Tân Túc, Bình Chánh, TPHCM", "Số 2B Cư xá Lữ Gia, Phường 13, Quận 11, TPHCM", "Tân Thới Hiệp 10, Phường Thảo Điền, Quận 2, TPHCM",
            "42, Phường An Phú, Quận 2, TPHCM", "Nhị Bình 19A, Xã  Đông Thạnh, Hóc Môn, TPHCM", "47, Phường Thảo Điền, Quận 2, TPHCM", "Ngọc Ngà, Phường Cần Thạnh , Cần Giờ, TPHCM", "Dương Đình Cúc, Thị trấn Tân Túc, Bình Chánh, TPHCM",
            "Trần Huy Liệu, Phường 4, Quận 3, TPHCM", "6B, Xã Phong Phú, Bình Chánh, TPHCM", "Yersin, Phường Đa Kao, Quận 1, TPHCM", "Số 22, Phường 9, Quận 8, TPHCM", "Trại Gà, Phường Bình Khánh, Quận 2, TPHCM",
            "Huỳnh Khương An, Phường 9, Gò Vấp, TPHCM", "Nguyễn Sơn Hà, Phường 12, Quận 10, TPHCM", "Thạnh Lộc 17, Phường Trung Mỹ Tây, Quận 12, TPHCM", "Trường Thành, Phường Tân Chánh Hiệp, Quận 12, TPHCM", "Dương Bá Trạc, Phường 5, Quận 5, TPHCM",
            "An Phú Đông 27, Xã Long Hòa, Cần Giờ, TPHCM", "Bình An, Phường An Lợi Đông, Quận 2, TPHCM", "10C, Phường An Lạc A, Bình Tân, TPHCM", "Hậu Lân, Phường Cần Thạnh , Cần Giờ, TPHCM", "D20, Phường An Lợi Đông, Quận 2, TPHCM",
            "Phan Văn Sửu, Phường 5, Tân Bình, TPHCM", "Mương Khai, Xã Bình Khánh, Cần Giờ, TPHCM", "Hưng Phước, Phường 12, Quận 5, TPHCM", "Bạch Vân, Phường 3, Quận 5, TPHCM", "Nguyễn Văn Chiêm, Phường Cầu Kho, Quận 1, TPHCM",
            "31, Phường Linh Trung, Thủ Đức, TPHCM", "23/9, Xã Tân Hiệp, Hóc Môn, TPHCM", "Thới Tứ 1, Xã Tân Xuân, Hóc Môn, TPHCM", "81, Phường Tân Quy, Quận 7, TPHCM", "Đặng Minh Khiêm, Phường 8, Quận 11, TPHCM",
            "47, Xã Lý Nhơn, Cần Giờ, TPHCM", "Tú Xương, Phường Đa Kao, Quận 1, TPHCM", "Số 6, Phường 10, Phú Nhuận, TPHCM", "Số 15, Xã Phước Lộc, Nhà Bè, TPHCM", "Hoàng Sa, Phường Đa Kao, Quận 1, TPHCM",
            "22, Phường Bình Trị Đông B, Bình Tân, TPHCM", "Lê Hùng Yên, Xã Thạnh An, Cần Giờ, TPHCM", "Tắc Xuất, Xã Long Hòa, Cần Giờ, TPHCM", "Khổng Tử, Phường Tăng Nhơn Phú A, Quận 9, TPHCM", "Số 50, Phường 1, Gò Vấp, TPHCM",
            "Đỗ Quang Đẩu, Phường Bến Nghé, Quận 1, TPHCM", "9, Phường Bình Trị Đông A, Bình Tân, TPHCM", "Số 6B, Xã Tân Quý Tây, Bình Chánh, TPHCM", "ĐT 107, Thị trấn Củ Chi, Củ Chi, TPHCM", "Bà Xán, Xã Long Hòa, Cần Giờ, TPHCM",
            "Quách Điêu 12, Xã Bình Hưng, Bình Chánh, TPHCM", "Phan Ngữ, Phường Bến Thành, Quận 1, TPHCM", "Số 5, Phường Hiệp Bình Chánh, Thủ Đức, TPHCM", "Số 27, Phường Tân Hưng, Quận 7, TPHCM", "Tân Trào, Phường Tân Hưng, Quận 7, TPHCM",
            "4, Phường 6, Bình Thạnh, TPHCM", "Mã Lò, Phường Phú Thọ Hòa, Tân Phú, TPHCM", "Số 14, Xã Nhị Bình, Hóc Môn, TPHCM", "Rạch Lồng Đèn, Phường 14, Quận 8, TPHCM", "Lê Thị Hoa, Phường Hiệp Bình Phước, Thủ Đức, TPHCM",
            "Tân Sơn, Phường 2, Tân Bình, TPHCM", "N4, Xã Phước Kiển, Nhà Bè, TPHCM", "Tây Thạnh, Phường Phú Trung, Tân Phú, TPHCM", "80B, Xã Trung Chánh, Hóc Môn, TPHCM", "Trích Sài, Xã Long Hòa, Cần Giờ, TPHCM",
            "111, Phường 17, Gò Vấp, TPHCM", "Số 10, Phường 13, Quận 3, TPHCM", "Nguyễn An Khương, Phường 1, Quận 5, TPHCM", "Nguyễn Phúc Nguyên, Phường 4, Quận 3, TPHCM", "Bà Ký, Phường 2, Quận 6, TPHCM",
            "Bình Giã, Phường Tân Sơn Nhì, Tân Phú, TPHCM", "23, Phường Bình Thọ, Thủ Đức, TPHCM", "Nghĩa Phát, Phường 11, Tân Bình, TPHCM", "Nguyễn Dữ, Phường Hòa Thạnh, Tân Phú, TPHCM", "Phan Văn Sửu, Phường 8, Tân Bình, TPHCM",
            "Tỉnh lộ 825, Xã An Phú Tây, Bình Chánh, TPHCM", "54, Phường 7, Quận 6, TPHCM", "Phạm Đăng Giảng, Phường Bình Hưng Hòa B, Bình Tân, TPHCM", "Nguyễn Văn Của, Phường 1, Quận 10, TPHCM", "Phạm Bân, Phường 3, Quận 5, TPHCM",
            "Số 29, Phường Phú Mỹ, Quận 7, TPHCM", "783, Phường Long Trường, Quận 9, TPHCM", "Tân Thành, Phường 14, Quận 5, TPHCM", "36, Phường Tân Phú, Quận 9, TPHCM", "Bà Xán, Xã Lý Nhơn, Cần Giờ, TPHCM",
            "Rần Chác, Xã Tam Thôn Hiệp, Cần Giờ, TPHCM", "24, Phường 4, Quận 4, TPHCM", "Trần Đại Nghĩa, Phường Tân Tạo, Bình Tân, TPHCM", "Khiêu Năng Tĩnh, Xã Lý Nhơn, Cần Giờ, TPHCM", "Võ Hoành, Phường Hiệp Tân, Tân Phú, TPHCM",
            "Số 3, Phường Trường Thọ, Thủ Đức, TPHCM", "21, Phường 5, Quận 8, TPHCM", "4, Phường 7, Quận 6, TPHCM", "225, Xã Phước Hiệp, Củ Chi, TPHCM", "Bình Thới, Phường 1, Quận 6, TPHCM",
            "Số 21A, Phường Bình Trị Đông A, Bình Tân, TPHCM", "2, Phường 5, Quận 6, TPHCM", "Lão Tử, Phường 14, Quận 5, TPHCM", "Nguyễn Khanh, Xã Thạnh An, Cần Giờ, TPHCM", "Tân Hiệp 18, Phường Bà Điểm, Hóc Môn, TPHCM",
            "Liên Ấp 1-2-3, Xã Hưng Long, Bình Chánh, TPHCM", "Số 5B, Phường  Thạnh Mỹ Lợi, Quận 2, TPHCM", "Bà Huyện Thanh Quan, Phường 5, Quận 4, TPHCM", "3, Phường 5, Quận 11, TPHCM", "H10, Phường An Lạc, Bình Tân, TPHCM",
            "Thạnh Xuân 22, Phường Thới An, Quận 12, TPHCM", "Trường Sa, Phường 13, Bình Thạnh, TPHCM", "Cầu Đôi, Xã Đa Phước, Bình Chánh, TPHCM", "Rần Chác, Xã Thạnh An, Cần Giờ, TPHCM", "Lê Thị Riêng, Phường 2, Quận 3, TPHCM",
            "Đồng Khởi, Phường 5, Tân Bình, TPHCM", "Nguyễn Thượng Hiền, Phường 5, Quận 10, TPHCM", "Kênh 3, Xã Lê Minh Xuân, Bình Chánh, TPHCM", "Số 97, Phường Bình Khánh, Quận 2, TPHCM", "Lưu Văn Lang, Phường Bến Nghé, Quận 1, TPHCM"};




}

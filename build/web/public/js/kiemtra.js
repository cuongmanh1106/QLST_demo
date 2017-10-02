// JavaScript Document
// Các hàm kiểm tra và hỏi xóa
function Kiemtradulieu()
{
	var kt=document.getElementsByClassName("kiemtra");
	for(i=0;i<kt.length;i++)
	{
		if(kt.item(i).value=="")
		{
			alert(kt.item(i).getAttribute("data_error"));
			kt.item(i).focus();
			return false; 	
		}	
	}
	return true;
}


function Xoaloaisanpham(ma_loai)
{
	if(confirm("Dữ liệu sẽ bị xóa, Không thể phục hồi lại\nBạn có chắc không?"))
	{
		window.location='xoa_loai_san_pham?ma_loai=' + ma_loai;
	}
}

function Xoaloaisanphamcha(ma_loai_cha)
{
	if(confirm("Dữ liệu sẽ bị xóa, Không thể phục hồi lại\nBạn có chắc không?"))
	{
		window.location='xoa_loai_san_pham_cha?ma_loai_cha=' + ma_loai_cha;
	}
}

function Xoasanpham(ma_san_pham)
{
	if(confirm("Dữ liệu sẽ bị xóa, Không thể phục hồi lại\nBạn có chắc không?"))
	{
		window.location='xoa_san_pham?ma_san_pham=' + ma_san_pham;
	}
}

function Xoahoadon(ma_hoa_don)
{
	if(confirm("Dữ liệu sẽ bị xóa, Không thể phục hồi lại\nBạn có chắc không?"))
	{
		window.location='xoa_hoa_don?ma_hoa_don=' + ma_hoa_don;
	}
}


function Xoanguoidung(ma_nguoi_dung)
{
	if(confirm("Dữ liệu sẽ bị xóa, Không thể phục hồi lại\nBạn có chắc không?"))
	{
		window.location='xoa_nguoi_dung?ma_nguoi_dung=' + ma_nguoi_dung;
	}
}

/* Nâng cao  */
function Xoadulieu(id_xoa,tbl_xoa,field_xoa)
{
	if(confirm("Dữ liệu sẽ bị xóa, Không thể phục hồi lại\nBạn có chắc không?"))
	{
		//window.location="xoadulieu.php?id_xoa=" + id_xoa + "&tbl_xoa="+ tbl_xoa + "&field_xoa=" + field_xoa;
		// url
		var url="xoadulieu.php";
		// data
		var data={"id_xoa":id_xoa,"tbl_xoa":tbl_xoa,"field_xoa":field_xoa};
		
		$.post(url,data,function(data){
				// Hiển thị kết quả trả về 
				$("#kqXoa").text(data);
				$("#kqXoa").css({"color":"#F00","font-weight":"bold"});
			})
		.done(function () { // Thành công
			window.setTimeout('location.reload()', 2000)
		})
			
	}
	
}

function Kiemtrathemsanpham()
{
    var ten_san_pham = document.getElementById("ten_san_pham");
    var don_gia = document.getElementById("don_gia");
    var hinh = document.getElementById("hinh");
    
    
    if(ten_san_pham.value == "")
    {
        alert("Nhập tên sản phẩm");
        ten_san_pham.focus();
        return false;
    }
    else if(Number(ten_san_pham.value))
    {
        alert("Nhập tên là chữ");
        ten_san_pham.select();
        return false;
    }
    else if(don_gia.value == "")
    {
        alert("Nhập Đơn giá");
        don_gia.focus();
        return false;
    }
    else if(isNaN(don_gia.value))
    {
        alert('nhập đơn giá là số');
        don_gia.select();
        return false;
    }
    else if(hinh.value == "")
    {
        alert('Vui lòng chọn hình');
        return false;
    }
    
    return true;
}

function kiemtraloaisanpham()
{
    var ten_san_pham = document.getElementById("ten_san_pham");
   
    
    if(ten_san_pham.value == "")
    {
        alert("Nhập tên sản phẩm");
        ten_san_pham.focus();
        return false;
    }
    else if(Number(ten_san_pham.value))
    {
        alert("Nhập tên là chữ");
        ten_san_pham.select();
        return false;
    }
    
    return true;
}

function kiemtranguoidung()
{
    var ho_ten = document.getElementById("ho_ten");
    var ten_dang_nhap = document.getElementById("ten_dang_nhap");
    var mat_khau = document.getElementById("mat_khau");
    var email = document.getElementById("email");
    
    if(ho_ten.value == "")
    {
        alert('nhập họ tên');
        ho_ten.focus();
        return false;
    }
    else if(Number(ho_ten.value))
    {
        alert('Nhập họ tên là chữ');
        ho_ten.select();
        return false;
    }
     else if(ten_dang_nhap.value == "")
    {
        alert('Nhập tên đăng nhập');
        ten_dang_nhap.focus();
        return false;
    }
    else if(mat_khau.value == "")
    {
        alert('Nhập mật khẩu');
        mat_khau.focus();
        return false;
    }
    else if(email.value == "")
    {
        alert('Nhập email');
        emailu.focus();
        return false;
    }
    return true;
}

function kiemtrasearchso()
{
    var tim = document.getElementById("tim");
    
    if(isNaN(tim.value))
    {
      alert("vui lòng nhập số");
      tim.select();
      return false;
    }
    return true;
}
 
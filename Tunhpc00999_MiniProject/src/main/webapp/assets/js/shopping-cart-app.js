const app = angular.module("shopping-cart-app", []);
app.controller("shopping-cart-ctrl", function($scope, $http) {

	$scope.create = function() {
		var item = angular.copy($scope.form);
		$http.post(`/rest/accounts`, item).then(resp => {
			alert("Thêm mới tài khoản thành công!");
		}).catch(error => {
			alert("Lỗi thêm mới tài khoản!");
			console.log("Error", error);
		});
	}

	$scope.doimk = function() {
		var item = angular.copy($scope.form);
		var username = $("#username").text();
		$http.get(`/rest/accounts/${username}`).then(resp => {	
			item = resp.data;
			if (item.password == $scope.form.password) {
				if ($scope.form.newPass == $scope.form.confirm) {
					item.password = $scope.form.newPass;
					$http.put(`/rest/accounts/${username}`, item).then(resp => {
						alert("Mật khẩu mới là: " + item.password)
					})

				} else {
					alert("Nhập lại mật khẩu không đúng")
				}
			}
			else {
				alert("Sai mật khẩu hoặc tài khoản")
			}
			$scope.form = {};
		});

	}


	//Upload hình
	$scope.imageChanged = function(files) {
		var data = new FormData();
		data.append('file', files[0]);
		$http.post('/rest/upload/images', data, {
			transformRequest: angular.identity,
			headers: { 'Content-Type': undefined }
		}).then(resp => {
			$scope.form.photo = resp.data.name;
		}).catch(error => {
			alert("Lỗi upload hình ảnh");
			console.log("Error", error);
		});
	}

	$scope.nut = false;
	$scope.check = function() {
		var item = angular.copy($scope.form);
		$http.get(`/rest/accounts/${item.username}`).then(resp => {
			item = resp.data;
			if (item.email == $scope.form.email) {
				$scope.kiemtra = true;
				$scope.nut = true;
			} else {
				alert("Sai email hoặc tài khoản")
			}
		}).catch(error => {
			alert("Tài khoản không tồn tại");
			console.log("Error", error);
		})
	}

	$scope.quenmk = function() {
		var item = angular.copy($scope.form);
		$http.get(`/rest/accounts/${item.username}`).then(resp => {
			item = resp.data;

			if ($scope.form.newPass == $scope.form.confirm) {
				item.password = $scope.form.newPass;
				$http.put(`/rest/accounts/${item.username}`, item).then(resp => {
					alert("Mật khẩu mới là: " + item.password)
				})

			} else {
				alert("Nhập lại mật khẩu không đúng")
			}
			$scope.form = {};
		})

	}

})

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Editar Producto</title>
</head>
<body>
	<div class="container mt-5">
		<div class="row justify-content-center mt-3">
			<div class="col-6">
				<form method="post">
					<label for="customerNumber mt-3" class="form-label mt-3">CustomerNumber</label>
					<select class="form-select" id="customerNumber" name="customerNumber">
						<c:forEach  items="${products}" var="c">
							<c:choose>
								<c:when test="${c.productCode == products.productCode}">
									<option value="${c.productCode}" selected>${c.productCode}-${c.productName}</option>
								</c:when>
								<c:otherwise>
									<option value="${c.productCode}">${c.productCode}-${c.productName}</option>
								</c:otherwise>
							</c:choose>							
						</c:forEach>					
					</select>
					<label for="productCode" class="form-label mt-3">Código Producto</label>
    				<input type="text" class="form-control" id="productCode" name="productCode" value="${products.productCode}" required >	
    				<label for="productName" class="form-label mt-3"></label>
    				<input type="text" class="form-control" id="paymentDate" name="paymentDate" value="${products.productName}" required>
    				<label for="productLine" class="form-label mt-3">Linea de Producto</label>
    				<input type="text" class="form-control" id="amount" name="amount" value="${products.productLine}" required>
    				<label for="productScale" class="form-label mt-3">Escala de Producto</label>
    				<input type="text" class="form-control" id="productScale" name="productScale" value="${products.productScale}" required >	
    				<label for="productVendor" class="form-label mt-3">Vendedor de Producto</label>
    				<input type="text" class="form-control" id="productVendor" name="productVendor" value="${products.productVendor}" required>
    				<label for="productDescription" class="form-label mt-3">Descripción</label>
    				<input type="text" class="form-control" id="productDescription" name="producDescription" value="${products.productDescription}" required>
    				<label for="quantityInStock" class="form-label mt-3">Cantiad en Stock</label>
    				<input type="number" class="form-control" id="quantityInStock" name="quantityInStock" value="${products.checkNumber}" required >	
    				<label for="buyPrice" class="form-label mt-3">Precio de Compra</label>
    				<input type="number" class="form-control" id="buyPrice" name="buyPrice" value="${products.buyPrice}" required>
    				<label for="MSRP" class="form-label mt-3">MSRP</label>
    				<input type="number" class="form-control" id="amount" name="amount" value="${products.amount}" required>
    				<input type="submit" class="btn btn-primary w-100 mt-3" value="AÑADIR" />					
				</form>
			</div>
		</div>
	</div>
</body>
</html>
fetch("/contacts")
.then(response => response.json())
.then(data => {

    let rows = "";

    data.forEach(contact => {

        rows += `
            <tr>
                <td>${contact.id}</td>
                <td>${contact.name}</td>
                <td>${contact.email}</td>
                <td>${contact.message}</td>
            </tr>
        `;

    });

    document.getElementById("tableBody").innerHTML = rows;

});
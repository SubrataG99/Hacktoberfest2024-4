import qrcode

# Function to generate QR code
def generate_qr_code(text):
    # Create a QR Code instance
    qr = qrcode.QRCode(
        version=1,  # controls the size of the QR Code
        error_correction=qrcode.constants.ERROR_CORRECT_L,  # controls the error correction used for the QR Code
        box_size=10,  # controls how many pixels each "box" of the QR code is
        border=4,  # controls how many boxes thick the border should be
    )
    
    # Add data to the QR code
    qr.add_data(text)
    qr.make(fit=True)

    # Create an image from the QR Code instance
    img = qr.make_image(fill='black', back_color='white')

    # Save the image to a file
    img.save('qr_code.png')
    print("QR code generated and saved as 'qr_code.png'.")

# Get user input
user_input = input("Enter the text to generate QR code: ")
generate_qr_code(user_input)

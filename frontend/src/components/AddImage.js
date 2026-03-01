import React ,{useState}from 'react'
import axios from 'axios';
import './AddImage.css';
import { useNavigate } from 'react-router-dom'; 
export default function AddImage() {
    const [file, setFile] = useState(null);
    const [message, setMessage] = useState('');
    const navigate = useNavigate(); 
  
    const handleFileChange = (e) => {
      setFile(e.target.files[0]);
    };
  
    const handleUpload = async () => {
      if (!file) {
        setMessage("Please select a file first.");
        return;
      }
  
      const formData = new FormData();
      formData.append("file", file);
  
      try {
        const response = await axios.post("http://localhost:8087/api/add", formData, {
          headers: {
            "Content-Type": "multipart/form-data"
          }
        });
        setMessage(response.data);
         setTimeout(() => {
        navigate('/admin-dashboard');
      }, 1000);

      } catch (error) {
        setMessage("Upload failed. Try again.");
      }
    };
  
    return (
      <div className="upload-container">
      <h2>Image Upload</h2>
      <input className="upload-input" type="file" onChange={handleFileChange} />
      <button className="upload-button" onClick={handleUpload}>Upload</button>
      <p className="upload-message">{message}</p>
    </div>
    );
}

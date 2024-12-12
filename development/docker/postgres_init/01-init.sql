

\c pve_manager

-- Create Customers Table
CREATE TABLE customers (
                           id SERIAL PRIMARY KEY,
                           name VARCHAR(255) NOT NULL,
                           email VARCHAR(255) NOT NULL UNIQUE,
                           created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Create Roles Table
CREATE TABLE roles (
                       id SERIAL PRIMARY KEY,
                       name VARCHAR(255) NOT NULL UNIQUE,
                       description TEXT
);

-- Create Users Table
CREATE TABLE users (
                       id SERIAL PRIMARY KEY,
                       username VARCHAR(255) NOT NULL UNIQUE,
                       password_hash VARCHAR(255) NOT NULL,
                       email VARCHAR(255) NOT NULL UNIQUE,
                       created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Create User_Role Junction Table
CREATE TABLE user_role (
                           user_id INTEGER REFERENCES users(id),
                           role_id INTEGER REFERENCES roles(id),
                           PRIMARY KEY (user_id, role_id)
);

-- Create User_Customer Junction Table
CREATE TABLE user_customer (
                               user_id INTEGER REFERENCES users(id),
                               customer_id INTEGER REFERENCES customers(id),
                               PRIMARY KEY (user_id, customer_id)
);

-- Create VM Flavors Table
CREATE TABLE vm_flavors (
                            id SERIAL PRIMARY KEY,
                            name VARCHAR(255) NOT NULL,
                            cpu_cores INTEGER NOT NULL,
                            ram_size INTEGER NOT NULL,
                            disk_size INTEGER NOT NULL
);

-- Create Applications Table
CREATE TABLE applications (
                              id SERIAL PRIMARY KEY,
                              name VARCHAR(255) NOT NULL,
                              description TEXT
);

-- Create VMs Table
CREATE TABLE vms (
                     id SERIAL PRIMARY KEY,
                     name VARCHAR(255) NOT NULL,
                     flavor_id INTEGER REFERENCES vm_flavors(id),
                     application_id INTEGER REFERENCES applications(id),
                     proxmox_id VARCHAR(255),
                     status VARCHAR(50),
                     created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                     updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                     customer_id INTEGER REFERENCES customers(id) NOT NULL
);

-- Insert some initial roles
INSERT INTO roles (name, description) VALUES
                    ('ADMIN', 'Administrator with full access'),
                    ('USER', 'Regular user with limited access');

-- Insert some sample VM flavors
INSERT INTO vm_flavors (name, cpu_cores, ram_size, disk_size) VALUES
                    ('Small', 1, 2048, 20),
                    ('Medium', 2, 4096, 40),
                    ('Large', 4, 8192, 80);

-- Insert some sample applications
INSERT INTO applications (name, description) VALUES
                    ('Apache', 'Apache HTTP Server'),
                    ('MySQL', 'MySQL Database Server'),
                    ('Nginx', 'Nginx Web Server');

-- Insert a new customer
INSERT INTO customers (name, email) VALUES
                    ('Example_Corp', 'contact@example.com')
                    RETURNING id;

-- Assuming the returned id is 1, insert a new user
-- Pass: 12345678
INSERT INTO users (username, password_hash, email) VALUES
                    ('test', '$2y$10$zs93f.EPz/9Q7/uyPp4NQ.Hbx8M9Iagkon2.4yjTf700FnhNUqUpC', 'user@example.com')
                    RETURNING id;

-- Assuming the returned user id is also 1, create the user-customer relationship
INSERT INTO user_customer (user_id, customer_id) VALUES
                    (1, 1);
